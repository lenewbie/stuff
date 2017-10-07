
val scalaTestVersion = "2.2.5"
val akkaVersion = "2.3.14"

lazy val commonSettings = Seq(
  organization := "org.castspells",
  version := "0.1.0",
  scalaVersion := "2.12.0",
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

val monocleVersion = "1.4.0"

lazy val monocle_stuff = (project in file("monocle_stuff")).
  settings(
    version := "1.0",
    scalaVersion := "2.12.1",
    libraryDependencies ++= Seq(
      "com.github.julien-truffaut" %%  "monocle-core"  % monocleVersion,
      "com.github.julien-truffaut" %%  "monocle-macro" % monocleVersion,
      "com.github.julien-truffaut" %%  "monocle-law"   % monocleVersion % Test,
      "org.scalatest" %% "scalatest" % "3.0.1" % Test
    )
  )







    