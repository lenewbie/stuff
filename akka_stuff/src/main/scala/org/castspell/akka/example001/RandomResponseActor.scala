package org.castspell.akka.example001

import akka.actor.Actor
import org.castspell.akka.example001.RandomResponseProtocol.{QuestionResponse, QuestionRequest}
import util.Random

class RandomResponseActor extends Actor {

  val quotes = List("Don't send me an email. Call by phone"
    , "Sorry I'm busy please call me later"
    , "Don't write so long commnents!"
    , "Don't create internal tickets I will not read them"
    , "Don't create external tickets - we will exceed our limit on agreed resources"
    , "Add me to all conversatios on IM, mail. I need to know!"
  )

  def receive = {
    case QuestionRequest => {
      val message = quotes( Random.nextInt(quotes.size) )
      val qoteResponse = QuestionResponse(message)
      println(qoteResponse)
    }
  }

}
