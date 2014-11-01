package core;

import core.MessageType.{ Notification, Success, Failure, Warning, Alert }

trait Notifiable {
  protected def sendSuccess(message: String) {
    notify(message, Success);
  }
  protected def sendFailure(message: String) {
    notify(message, Failure);
  }
  protected def alert(message: String) {
    notify(message, Alert);
  }
  protected def warn(message: String) {
    notify("[Warning] " + message, Warning);
  }
  protected def notify(
    message: String,
    messageType: MessageType = Notification
  ) {
    // web hook to notify player
  }
}
