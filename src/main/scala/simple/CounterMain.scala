package simple

import akka.actor.{Actor, Props, ActorRef}


class CounterMain extends Actor{
	
	val counter = context.actorOf(Props[Counter], "counter")

	counter ! "incr"
	counter ! "incr"
	counter ! "incr"
	counter ! "get"
  
	def receive : Receive = {
	  case count: Int => 
	    println(s"count was $count")
	    context.stop(self)
	}
}