class Room(val name: String, capacity: Int) {
  if (capacity < 0) throw new IllegalStateException
  var people = 0

  def enter(numOfPeople: Int): Boolean = {
    if (capacity - people >= numOfPeople) {
      people += numOfPeople
      true
    }
    else false
  }

  def leave(numOfPeople: Int): Boolean = {
    if (people >= numOfPeople) {
      people -= numOfPeople
      true
    }
    else false
  }

  def peopleInRoom: Int = people
}


