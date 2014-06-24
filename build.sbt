name := "hello-counter-akka"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4-SNAPSHOT"
 
libraryDependencies += "com.typesafe.akka" % "akka-testkit_2.10" % "2.3.3"
	
libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.3"	
  
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
  
