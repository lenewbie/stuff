
val akkaVersion = "2.3.12"

name := "akka_stuff_logging_testing"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % akkaVersion

libraryDependencies += "com.typesafe.akka" % "akka-slf4j_2.11" % akkaVersion

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3"
