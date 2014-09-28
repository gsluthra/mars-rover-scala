package commands

import org.scalatest._
import org.scalatest.matchers.ShouldMatchers
import rover.MarsRover
import universe.{Plateau, NORTH, Coordinates}

class RoverCommandSpec extends FlatSpec with ShouldMatchers {

  val plateau = Plateau(topRight = Coordinates(10,10))

  "MoveCommand" should "should move rover" in {
    val rover = MarsRover(plateau, Coordinates(1,3), NORTH)
    MoveCommand.execute(rover).currentLocation should be === "(1, 4, N)"

  }

  "TurnLeftCommand" should "should turn rover left" in {
    val rover = MarsRover(plateau, Coordinates(1,3), NORTH)
    TurnLeftCommand.execute(rover).currentLocation should be === "(1, 3, W)"

  }

  "TurnRightCommand" should "should turn rover right" in {
    val rover = MarsRover(plateau, Coordinates(1,3), NORTH)
    TurnRightCommand.execute(rover).currentLocation should be === "(1, 3, E)"

  }

}
