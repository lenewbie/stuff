
val scalaTestVersion = "2.2.5"
val akkaVersion = "2.3.14"

lazy val commonSettings = Seq(
  organization := "org.castspells",
  version := "0.1.0",
  scalaVersion := "2.11.7",
  libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.11.7",
  libraryDependencies += "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.4",
  libraryDependencies += "org.scalatest" % "scalatest_2.11" % scalaTestVersion % "test"
)


lazy val euler_problems = (project in file("euler_problems")).
  settings(commonSettings: _*).
  settings(
    // other settings
  )

lazy val learn_syntax = (project in file("learn_syntax")).
  settings(commonSettings: _*).
  settings(
    // other settings
  )


lazy val tdd = (project in file("tdd")).
  settings(commonSettings: _*).
  settings(
    // other settings
  )


lazy val coursea_algorithms = (project in file("coursea_algorithms")).
  settings(commonSettings: _*).
  settings(
    // other settings
  )

lazy val scala_patterns_tricks_style = (project in file("scala_patterns_tricks_style")).
  settings(commonSettings: _*).
  settings(
    // other settings
  )


lazy val learn_scalaz = (project in file("learn_scalaz")).
  settings(commonSettings: _*).
  settings(
    // other settings
  )


lazy val akka_stuff = (project in file("akka_stuff")).
  settings(commonSettings: _*).
  settings(
    libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % akkaVersion
  )


lazy val akka_stuff_logging_testing = (project in file("akka_stuff_logging_testing")).
  settings(commonSettings: _*).
  settings(
    libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % akkaVersion,
    libraryDependencies += "com.typesafe.akka" % "akka-slf4j_2.11" % akkaVersion,
    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3",
    libraryDependencies += "junit" % "junit" % "4.12" % "test",
    libraryDependencies += "com.typesafe.akka" % "akka-testkit_2.11" % akkaVersion
  )


lazy val learn_scalactic = (project in file("learn_scalactic")).
  settings(commonSettings: _*).
  settings(
    libraryDependencies += "org.scalactic" % "scalactic_2.11" % scalaTestVersion
  )







    