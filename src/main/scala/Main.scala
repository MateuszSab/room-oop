object Main extends App {

  val newroom = new Room("living", 10)
  newroom.enter(5)
  println(newroom.stateOfaRoom)
  newroom.leave(3)
  println(newroom.stateOfaRoom)
  newroom.enter(20)

}
