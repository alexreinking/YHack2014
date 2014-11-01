package core;

import scala.language.implicitConversions;

trait HasName {
  val name: String;
  override def toString: String = name;
  implicit def self2String(self: HasName): String = name;
}
