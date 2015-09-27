package effectove_scala_jsuereth

import scala.collection.mutable
import scala.collection.Set

object ThinkInExpressionsNotStatements {

  def main(args: Array[String]) {
    println(errMsg(42))
    println(errMsg(1))
    println(errMsg(2))
  }

  // ==============

  def errMsgWithStatemensInsteadOfExpression(errorCode: Int): String = {
    var result: String = match {
      case 1 => "network Failure"
      case 2 => "I/O Failure"
      case _ => "Unknown error"
    }
    return result;
  }

  // body is single expression => no brackets for block of code
  def errMsg(errorCode: Int): String =
    errorCode match {
      case 1 => "network Failure"
      case 2 => "I/O Failure"
      case _ => "Unknown Error"
    }


  //  EXAMPLE 2

  case class PersonAddress(city: String)
  case class People(addresses: Set[PersonAddress])

  def findPeopleExpressiveIn(city: String, people: Seq[People]): Set[People] = {
    val found = new mutable.HashSet[People]
    for(person <- people) {
      for(address <- person.addresses) {
        if(address.city == city)
          found.add(person)
      }
    }
    return found
  }

  def findPeopleIn(city: String, people: Seq[People]): Set[People] =
    for{
      person <- people.toSet[People]
      address <- person.addresses
      if address.city == city
    } yield person

}