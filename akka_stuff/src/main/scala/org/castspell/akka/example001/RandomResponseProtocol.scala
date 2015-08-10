package org.castspell.akka.example001

object RandomResponseProtocol {
  case class QuestionRequest()
  case class QuestionResponse(wordsOfWisdom: String)
}
