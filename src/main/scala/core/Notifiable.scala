package core;

import core.MessageType.{Notification, Success, Failure, Warning, Alert}
import javax.websocket.Session
import server.messages.{ErrorMessage, UpdateMessage}

trait Notifiable {
  protected val session: Session

  def sendSuccess(message: String) {
    notify(message, Success)
  }

  def sendFailure(message: String) {
    notify(message, Failure)
  }

  def alert(message: String) {
    notify(message, Alert)
  }

  def warn(message: String) {
    notify("[Warning] " + message, Warning)
  }

  def sendError(message: String): Unit = {
    session.getBasicRemote.sendObject(new ErrorMessage(message))
  }

  def notify(message: String, messageType: MessageType = Notification): Unit = {
    session.getBasicRemote.sendObject(new UpdateMessage(message, messageType))
  }
}
