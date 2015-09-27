package org.castspell.akkastuff

object TeacherProtocol {

  case class QuoteRequest()
  case class QuoteResponse(quoteString:String)

}
