object Main extends App {

  val newroom = new Room("living", 10)
  println(newroom.enter(5))
  println(newroom.peopleInRoom)
  println(newroom.leave(3))
  println(newroom.peopleInRoom)
  println(newroom.enter(20))

}
