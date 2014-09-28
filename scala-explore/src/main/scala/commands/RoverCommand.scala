package commands

import rover.MarsRover

trait RoverCommand {
  def execute(rover: MarsRover): MarsRover
}

object MoveCommand extends RoverCommand{
  override def execute(rover: MarsRover): MarsRover = rover.move()
}

object TurnLeftCommand extends RoverCommand{
  override def execute(rover: MarsRover): MarsRover = rover.turnLeft()
}

object TurnRightCommand extends RoverCommand{
  override def execute(rover: MarsRover): MarsRover = rover.turnRight()
}

