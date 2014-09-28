package universe


sealed trait Direction {
  def left: Direction
  def right: Direction
}

object NORTH extends Direction {
  override def left: Direction = WEST
  override def right: Direction = EAST
}

object SOUTH extends Direction {
  override def left: Direction = EAST
  override def right: Direction = WEST
}

object EAST extends Direction {
  override def left: Direction = NORTH
  override def right: Direction = SOUTH
}

object WEST extends Direction {
  override def left: Direction = SOUTH
  override def right: Direction = NORTH
}

