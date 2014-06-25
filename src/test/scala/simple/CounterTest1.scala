package simple

import akka.actor.{ActorSystem, Props}
import akka.testkit.{TestProbe}

import scala.concurrent.duration._

import org.scalatest.FunSuite


class CounterTest1 extends FunSuite		
{
	test("Test Counter Actor # 1") 
	{
	    implicit val system = ActorSystem("TestSysCounter1")
	    val counter = system.actorOf(Props[Counter], "testActorCounter1")
		
	    val p = TestProbe()
		
	    p.send(counter, "incr")
	    p.expectNoMsg(1.second)
	    
	    p.send(counter, "incr")
	    p.expectNoMsg(1.second)
	    
	    p.send(counter, "get")
	    p.expectMsg(2)
	    
	    system.shutdown()
	}	
}