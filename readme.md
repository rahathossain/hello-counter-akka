Simple Akka project using SBT 
==============================

This is a simple akka project created using sbt from scratch.    

### Create Project Directory 
 $ mkdir hello-counter-akka

 $ cd hello-counter-akka

### Create `build.sbt` File
 $ vi build.sbt

```
name := "hello-counter-akka"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4-SNAPSHOT"
 
libraryDependencies += "com.typesafe.akka" % "akka-testkit_2.10" % "2.3.3"
	
libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.3"	
  
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/" 
```

### Start sbt
Use `sbt` command to start sbt 

$ sbt

 while sbt will load, a *project* directory will create automatically
 
 To exit from sbt  

&gt; exit 

### Create `plugin.sbt`

Create `plugin.sbt` inside */hello-counter-akka/project* directory  
 
$ cd project

$ vi plugins.sbt

```
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")
```

come out from */hello-counter-akka/project* to */hello-counter-akka*
 
$ cd ..
 
### Create Eclipse project
$ sbt

now use 'eclipse' command before loading the project from eclipse   
&gt; eclipse