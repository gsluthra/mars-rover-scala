package universe

case class Coordinates(x: Int, y: Int){

  def incrementBy(xIncrement: Int, yIncrement: Int): Coordinates = {
    Coordinates(this.x + xIncrement, this.y + yIncrement)
  }
}


