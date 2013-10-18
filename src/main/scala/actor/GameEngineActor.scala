package com.bheap.polecat.actor

import com.bheap.polecat.payload.CheckGameState
import akka.actor.{Actor, ActorLogging}

class GameEngineActor extends Actor with ActorLogging {

  def receive = {
    case CheckGameState => {
      log.info("Some shit just happened hyar bub!")
    }
  }
}