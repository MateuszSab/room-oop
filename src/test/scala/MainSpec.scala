import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class MainSpec extends AnyFlatSpec with should.Matchers {
  val newroom = new Room("living", 10)


  "enter" should "return true if a number of people entering the room and currently in " +
    "the room is smaller or equal to amount of new people, otherwise false" in {

    newroom.enter(10) shouldBe true
    newroom.enter(11) shouldBe false
  }

  "leave" should "return true if a number of people leaving the room " +
    "is smaller or equal to amount of people in the room, otherwise false" in {

    newroom.leave(10) shouldBe true
    newroom.leave(11) shouldBe false
  }

  "peopleInRoom" should "return 0" in {
    newroom.peopleInRoom shouldBe 0
  }

}
