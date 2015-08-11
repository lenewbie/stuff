package org.castspell.akkastuff

import akka.actor.{Props, ActorSystem}
import org.castspell.akkastuff.TeacherProtocol.QuoteRequest

/*
Based on:
  http://rerun.me/2014/09/11/introducing-actors-akka-notes-part-1/
  http://rerun.me/2014/09/19/akka-notes-actor-messaging-1/
  http://rerun.me/2014/09/29/akka-notes-logging-and-testing/
 */
object StudentSimulator extends App {

  val actorSystem = ActorSystem("UniversityMessageSystem")
  val teacherActorRef = actorSystem.actorOf(Props[TeacherActor])
  teacherActorRef ! QuoteRequest
  println(13)
  Thread.sleep(4000)
  println(13)
  actorSystem.shutdown()
}
