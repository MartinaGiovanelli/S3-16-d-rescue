package it.unibo.drescue.controller

import it.unibo.drescue.connection.{RabbitMQConnectionImpl, RabbitMQImpl}
import it.unibo.drescue.model.ObjectModel
import it.unibo.drescue.view.MainView

class MainControllerImpl(private var model: List[ObjectModel]) {

  var connection: RabbitMQConnectionImpl = null
  var loginChannel: RabbitMQImpl = null
  var cpID: String = null

  var view = new MainView(null, null, null, null, null, null, null)

  def addView(viewValue: MainView): Unit = {
    view = viewValue
  }

  def changeView(nextView: String) = {
    view.changeView(nextView)
  }

  def _loginChannel: RabbitMQImpl = loginChannel

  def _view: MainView = view

  def cpID_(currentCpID: String): Unit = {
    cpID = currentCpID
  }
}
