package immutable

import akka.actor.{Actor, Props, ActorRef}


class ImmutableCounterMain extends Actor{
	
	val immutableCounter = context.actorOf(Props[ImmutableCounter], "ImmutableCounter")
	
	immutableCounter ! "incrx"
	immutableCounter ! "incrx"
	immutableCounter ! "incrx"
	immutableCounter ! "getx"
  
  
	def receive : Receive = {
	  case count: Int => 
	    println(s"count was $count")
	    context.stop(self)
	}
}