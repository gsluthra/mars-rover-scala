package universe


sealed trait Direction {
  def left: Direction
  def right: Direction
}

object NORTH extends Direction {
  override def left: Direction = WEST
  override def right: Direction = EAST
  override def toString: String = "N"
}

object SOUTH extends Direction {
  override def left: Direction = EAST
  override def right: Direction = WEST
  override def toString: String = "S"
}

object EAST extends Direction {
  override def left: Direction = NORTH
  override def right: Direction = SOUTH
  override def toString: String = "E"
}

object WEST extends Direction {
  override def left: Direction = SOUTH
  override def right: Direction = NORTH
  override def toString: String = "W"
}

