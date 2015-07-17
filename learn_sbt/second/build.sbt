
lazy val second = (project in file(".")).
	settings(
		name := "second",
		version := "1.0",
		scalaVersion := "2.11.7",
		libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
	)
