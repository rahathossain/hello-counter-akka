package simple

import akka.actor.{ActorSystem, Props}
import akka.testkit.{TestProbe, TestKit, ImplicitSender}

import scala.concurrent.duration._

import org.scalatest.FunSuite


class CounterTest2 extends FunSuite 
{
  new TestKit(ActorSystem("TestSysCounter2")) with ImplicitSender  
  {
	test("Test Counter Actor # 2") 
	{
	  val counter = system.actorOf(Props[Counter], "testActorCounter2")
	  counter ! "incr"
	  counter ! "incr"
	  counter ! "get"
	  expectMsg(2)
	}
  }
}