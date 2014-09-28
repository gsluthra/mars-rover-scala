import org.scalatest._
import org.scalatest.matchers.ShouldMatchers
import universe._

class MarsRoverSpec extends FlatSpec with ShouldMatchers {

  val plateau_20_20 = Plateau(topRight = Coordinates(20,20))

  "MarsRover" should " provide current location as a string" in {
    MarsRover(plateau_20_20, Coordinates(2,2), NORTH).toString should be === "(2, 2, N)"
  }

  "MarsRover" should " be able to turn left" in {
    val rover = MarsRover(plateau_20_20, Coordinates(3, 2), NORTH)
    rover.turnLeft().currentLocation should be === "(3, 2, W)"
  }

  "MarsRover" should " be able to turn right" in {
    val rover = MarsRover(plateau_20_20, Coordinates(3, 2), EAST)
    rover.turnRight().currentLocation should be === "(3, 2, S)"
  }

  "MarsRover" should " be able to move 1 step along Y axis when facing NORTH" in {
    val rover = MarsRover(plateau_20_20, Coordinates(3, 2), NORTH)
    rover.move().currentLocation should be === "(3, 3, N)"
  }

  "MarsRover" should " be able to move 1 step along Y axis when facing SOUTH" in {
    val rover = MarsRover(plateau_20_20, Coordinates(3, 2), SOUTH)
    rover.move().currentLocation should be === "(3, 1, S)"
  }

  "MarsRover" should " be able to move 1 step along X axis when facing EAST" in {
    val rover = MarsRover(plateau_20_20, Coordinates(3, 2), EAST)
    rover.move().currentLocation should be === "(4, 2, E)"
  }

  "MarsRover" should " be able to move 1 step along X axis when facing WEST" in {
    val rover = MarsRover(plateau_20_20, Coordinates(3, 2), WEST)
    rover.move().currentLocation should be === "(2, 2, W)"
  }

  "MarsRover" should " not fall off the plateau in NORTH direction when asked to move" in {
    val rover = MarsRover(plateau_20_20, Coordinates(19, 19), NORTH)
    rover.move().move().move().currentLocation should be === "(19, 20, N)"
  }

  "MarsRover" should " not fall off the plateau in SOUTH direction when asked to move" in {
    val rover = MarsRover(plateau_20_20, Coordinates(1, 1), SOUTH)
    rover.move().move().move().currentLocation should be === "(1, 0, S)"
  }

  "MarsRover" should " not fall off the plateau in EAST direction when asked to move" in {
    val rover = MarsRover(plateau_20_20, Coordinates(18, 4), EAST)
    rover.move().move().move().currentLocation should be === "(20, 4, E)"
  }

  "MarsRover" should " not fall off the plateau in WEST direction when asked to move" in {
    val rover = MarsRover(plateau_20_20, Coordinates(2, 4), WEST)
    rover.move().move().move().currentLocation should be === "(0, 4, W)"
  }


}
