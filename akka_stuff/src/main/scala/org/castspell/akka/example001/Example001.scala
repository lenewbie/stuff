package org.castspell.akka.example001

import akka.actor.{ActorSystem, Props}
import org.castspell.akka.example001.RandomResponseProtocol.QuestionRequest

/**
 * Example shows:
 * - create actor system
 * - create AcotrRef using Props
 * - create messages wrapped in object (protocol)
 *
 * Inspired by:
 *  http://rerun.me/2014/09/19/akka-notes-actor-messaging-1/
 */
object Example001 {

   def main(args: Array[String]) = {
     val someCompany = ActorSystem("Acme")
     val busyBoss = someCompany.actorOf( Props[RandomResponseActor] )
     busyBoss  ! QuestionRequest
     Thread.sleep(2000)
     someCompany.shutdown()
   }

 }
