How to make simple Akka project using SBT? 
===========================================

$mkdir hello-counter-akka

$cd hello-counter-akka

$vi build.sbt

```
name := "hello-counter-akka-one"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies +=
  "com.typesafe.akka" %% "akka-actor" % "2.4-SNAPSHOT"
  
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"  
```

$sbt
...
use exit to exit from sbt
>exit 

$cd project

$vi plugins.sbt

```
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")
```

$sbt

now use 'eclipse' command before loading the project from eclipse   
>eclipse











 

 

