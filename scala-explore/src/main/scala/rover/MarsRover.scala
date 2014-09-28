package rover

import commands.RoverCommand
import parser.StringCommandParser
import universe._

case class MarsRover(plateau: Plateau, currentPoint: Coordinates, face: Direction){
  def run(commandString: String) = {
    val commands: Seq[RoverCommand] = StringCommandParser(Option(commandString)).commands
    commands.foldLeft(this)((rover, command) => command.execute(rover))
  }

  def move() = {

    val newCoordinate = face match {
      case NORTH => currentPoint.incrementBy(0, 1)
      case SOUTH => currentPoint.incrementBy(0, -1)
      case EAST  => currentPoint.incrementBy( 1, 0)
      case WEST  => currentPoint.incrementBy(-1, 0)
    }

    if(plateau.withinBounds(newCoordinate))
      MarsRover(plateau, newCoordinate , face)
    else
      this

  }


  def turnLeft() = {
      MarsRover(plateau, currentPoint, face.left)
  }

  def turnRight() = {
      MarsRover(plateau, currentPoint, face.right)
  }

  def currentLocation: String = {
    toString
  }

  override def toString: String = {
    s"(${currentPoint.x}, ${currentPoint.y}, ${face})"
  }

}
