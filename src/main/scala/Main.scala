package com.bheap.polecat

import com.bheap.polecat.actor._
import com.bheap.polecat.payload._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import akka.actor.{ActorSystem, Props}

object Main extends App {

  // Bootstrap game, here we create the game engine
  // and work out how many players there are etc

  val system = ActorSystem("Polecat")
  val gameEngine = system.actorOf(Props[GameEngineActor], name = "gameEngine")

  system.scheduler.schedule(0 seconds, 2 seconds, gameEngine, CheckGameState)
}
