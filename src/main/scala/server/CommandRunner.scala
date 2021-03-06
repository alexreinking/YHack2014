package server

import antlr.CommandParser._
import antlr.{CommandBaseVisitor, CommandParser}
import org.antlr.v4.runtime.tree.ParseTree
import state.{Game, Player}

import scala.collection.JavaConverters._

class CommandRunner(gameRoom: Game, issuingPlayer: Player) extends CommandBaseVisitor[Void] {
  override def visitRelativeMovement(ctx: RelativeMovementContext): Void = {
    gameRoom.move(issuingPlayer, ctx.direction().getText match {
      case "n" => "north";
      case "s" => "south";
      case "e" => "east";
      case "w" => "west";
      case dir => dir;
    })
    super.visitRelativeMovement(ctx)
  }

  override def visitInteraction(ctx: InteractionContext): Void = {
    val longName = joinLongName(ctx.longName())

    if (ctx.Drop() != null) {
      issuingPlayer.dropItem(longName, if (ctx.Number() != null) Some(ctx.Number().getText.toInt) else None)
    } else if (ctx.Eat() != null) {
      gameRoom.eat(issuingPlayer, longName);
    } else if (ctx.Take() != null || ctx.Pick() != null) {
      gameRoom.take(issuingPlayer, longName);
    }

    super.visitInteraction(ctx)
  }


  override def visitAttack(ctx: AttackContext): Void = {
    val target = joinLongName(ctx.longName(0))
    val weapon = Option(joinLongName(ctx.longName(1)))

    gameRoom.attack(issuingPlayer, target, weapon)

    super.visitAttack(ctx)
  }

  override def visitInspection(ctx: InspectionContext): Void = {
    val longName = joinLongName(ctx.longName())

    if (ctx.Look() != null || ctx.Examine() != null || ctx.Inspect() != null) {
      gameRoom.lookAt(issuingPlayer, longName);
    } else if (ctx.Open() != null) {
      gameRoom.open(issuingPlayer, longName);
    }

    super.visitInspection(ctx)
  }

  override def visitSpecificMovement(ctx: SpecificMovementContext): Void = {
    gameRoom.move(issuingPlayer, joinLongName(ctx.longName()))
    super.visitSpecificMovement(ctx)
  }

  private def joinLongName(ctx: CommandParser.LongNameContext): String = {
    ctx.Identifier().asScala.map(_.getText).mkString(" ")
  }

  override def visitCheckHealth(ctx: CheckHealthContext): Void = {
    issuingPlayer.notify("You have " + issuingPlayer.health + " hit points left.")
    super.visitCheckHealth(ctx)
  }

  override def visitCheckStatus(ctx: CheckStatusContext): Void = {
    issuingPlayer.notify("You have " + issuingPlayer.health + " hit points left.")
    super.visitCheckStatus(ctx)
  }

  override def visitInventory(ctx: InventoryContext): Void = {
    if (issuingPlayer.inventory.isEmpty) issuingPlayer.notify("Your inventory is empty.")
    else issuingPlayer.inventory.zipWithIndex.foreach({
      case (item, i) => issuingPlayer.notify("(%d) %s: %s".format(i + 1, item.name, item.description))
    })
    super.visitInventory(ctx)
  }
}

object CommandRunner {
  def execute(gameRoom: Game, issuingPlayer: Player, tree: ParseTree) = {
    new CommandRunner(gameRoom, issuingPlayer).visit(tree)
  }
}

