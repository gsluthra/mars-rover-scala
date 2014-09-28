package universe

import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

class CoordinatesSpec extends FlatSpec with ShouldMatchers {
  "Coordinates" should "have string representation" in {
    Coordinates(20, 5).toString.length should be  > 0
  }

  "Coordinates" should "be incrementable for x and y" in {
    Coordinates(20, 5).incrementBy(1,2) should be === Coordinates(21,7)
  }

  "Coordinates" should "be incrementable for negative x and y" in {
    Coordinates(20, 5).incrementBy(-20,-2) should be === Coordinates(0,3)
  }

  "Coordinates" should "on incrementing should be immutable" in {
    val original = Coordinates(1,1)
    val newC = original.incrementBy(2,3)
    original should be === Coordinates(1,1)
    newC should be === Coordinates(3,4)
  }


  "Coordinates" should "be able to check within Bounds" in {
    Coordinates(20, 20).withinBounds(Coordinates(10,10)) should be === true
  }

  "Coordinates" should "should not be in bound for x" in {
    Coordinates(20, 20).withinBounds(Coordinates(21,10)) should be === false
  }


  "Coordinates" should "should not be in bound for y" in {
    Coordinates(20, 20).withinBounds(Coordinates(5,22)) should be === false
  }

}
