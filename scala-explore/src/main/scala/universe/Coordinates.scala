package universe

case class Coordinates(x: Int, y: Int){
  def withinBounds(other: Coordinates) = {
    this.x >= other.x && this.y >= other.y
  }

  def incrementBy(xIncrement: Int, yIncrement: Int): Coordinates = {
    Coordinates(this.x + xIncrement, this.y + yIncrement)
  }
}


