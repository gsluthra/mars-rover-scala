package universe

import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

class DirectionSpec extends FlatSpec with ShouldMatchers {

  "Direction" should "NORTH when turned left should give WEST" in {
    val d: Direction = NORTH
    d.left should be === WEST
  }

  "Direction" should " from NORTH when turned left 3 times should give EAST" in {
    val d: Direction = NORTH
    d.left.left.left should be === EAST
  }

  "Direction" should " from EAST when turned right should give SOUTH" in {
    val d: Direction = EAST
    d.right should be === SOUTH
  }

  "Direction" should " from EAST when turned right 3 times should give NORTH" in {
    val d: Direction = EAST
    d.right.right.right should be === NORTH
  }

   "Direction" should " from SOUTH when turned right 7 times should give EAST" in {
    val d: Direction = SOUTH
    d.right.right.right.right.right.right.right should be === EAST
  }

}
