import akka.actor.{Props, ActorSystem}
import akka.testkit.{TestActorRef, TestKit}
import org.castspell.akkastuff.TeacherActor
import org.castspell.akkastuff.TeacherProtocol.QuoteRequest
import org.scalatest.{BeforeAndAfterAll, WordSpecLike, BeforeAndAfter, MustMatchers}

class TeacherActorTest extends TestKit(ActorSystem("UniversityMessageSystem"))
  with WordSpecLike with MustMatchers with BeforeAndAfterAll {

  "a teacher with ActorLogging" must {
    "log a qote when a QuoteRequest message is sent" in {
      val teacherRef = TestActorRef[TeacherActor]
      teacherRef ! QuoteRequest
    }
  }

  override def afterAll() = {
    super.afterAll()
    system.shutdown()
  }
}


