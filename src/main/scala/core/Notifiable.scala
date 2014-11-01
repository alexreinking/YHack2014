package core

import javax.websocket.Session

import core.MessageType.{Notification, Success, Failure, Warning, Alert}
import server.messages.UpdateMessage

trait Notifiable {
  protected val session: Session

  protected def sendSuccess(message: String) {
    notify(message, Success)
  }

  protected def sendFailure(message: String) {
    notify(message, Failure)
  }

  protected def alert(message: String) {
    notify(message, Alert)
  }

  protected def warn(message: String) {
    notify("[Warning] " + message, Warning)
  }

  protected def notify(message: String, messageType: MessageType = Notification): Unit = {
    session.getBasicRemote.sendObject(new UpdateMessage(message, messageType))
  }
}
