package universe

import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

class PlateauSpec extends FlatSpec with ShouldMatchers {
  val plateau = Plateau(Coordinates(2,2), Coordinates(10,10))

  "Plateau" should "bottom left should by default be at origin" in {
    Plateau(topRight = Coordinates(10,10)).bottomLeft should be === Coordinates(0,0)
  }

  "Plateau" should "say out of bounds for Coordinates out of top right" in {
    plateau.withinBounds(Coordinates(11,8)) should be === false
  }

  "Plateau" should "say out of bounds for Coordinates below bottom left" in {
    plateau.withinBounds(Coordinates(1,2)) should be === false
  }

  "Plateau" should "say out within bounds for Coordinates inside" in {
    plateau.withinBounds(Coordinates(9,7)) should be === true
  }

  "Plateau" should "say within bounds for Coordinates on top right" in {
    plateau.withinBounds(Coordinates(10,10)) should be === true
  }

  "Plateau" should "say within bounds for Coordinates on bottom left" in {
    plateau.withinBounds(Coordinates(2,2)) should be === true
  }
}
