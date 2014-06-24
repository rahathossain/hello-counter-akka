name := "hello-counter-akka"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies +=
  "com.typesafe.akka" %% "akka-actor" % "2.4-SNAPSHOT"
  
libraryDependencies +=
  "com.typesafe.akka" %% "akka-cluster" % "2.4-SNAPSHOT"    
  
libraryDependencies += 
	"com.typesafe.akka" % "akka-testkit_2.10" % "2.3.3"
  
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"  
