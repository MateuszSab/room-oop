class Room(name: String, capacity: Int) {
  val n = name
  val cap = capacity
  var people = 0

  def enter(numOfPeople: Int) = {
    if (cap + people >= numOfPeople) people += numOfPeople
    else println("Too crowded!")
  }
  def leave(numOfPeople: Int) = people -= numOfPeople

  def stateOfaRoom = people
}


