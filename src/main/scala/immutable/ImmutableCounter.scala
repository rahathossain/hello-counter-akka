package immutable

import akka.actor.Actor

class ImmutableCounter extends Actor {
  
	def counter(n: Int): Receive = {
	  case "incrx" => context.become(counter(n+1))
	  case "getx" => sender ! n
	} 
	
	def receive = counter(0)

}