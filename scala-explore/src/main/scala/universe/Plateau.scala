package universe

case class Plateau(bottomLeft: Coordinates = Coordinates(0,0), topRight: Coordinates) {
  def withinBounds(coordinates: Coordinates): Boolean = {
    coordinates.x >= bottomLeft.x &&
    coordinates.x <= topRight.x &&
    coordinates.y >= bottomLeft.y &&
    coordinates.y <= topRight.y
  }

}
