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

}
