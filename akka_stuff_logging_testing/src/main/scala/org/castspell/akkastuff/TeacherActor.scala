package org.castspell.akkastuff

import akka.actor.{ActorLogging, Actor}
import org.castspell.akkastuff.TeacherProtocol.{QuoteResponse, QuoteRequest}

class TeacherActor extends Actor with ActorLogging {

  val quotes = List(
    "Moderation is for cowards",
    "anything worth doing is worth overdoing",
    "The trouble is you think you have time" ,
    "You never gonna know if you never even try")

  def receive = {
    case QuoteRequest => {
      import util.Random

      val quoteResponse = QuoteResponse(quotes(Random.nextInt(quotes.size)))

      log.debug(quoteResponse.toString)
    }
  }

  def quoteList = quotes
}
