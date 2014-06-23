name := "hello-counter-akka-one"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies +=
  "com.typesafe.akka" %% "akka-actor" % "2.4-SNAPSHOT"
  
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"  