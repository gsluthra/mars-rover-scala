package parser

import commands.{TurnRightCommand, TurnLeftCommand, MoveCommand}
import org.scalatest._
import org.scalatest.matchers.ShouldMatchers
import universe._

class StringCommandParserSpec extends FlatSpec with ShouldMatchers {

   val plateau_20_20 = Plateau(topRight = Coordinates(20,20))

   "StringCommandParser" should " create two MoveCommands" in {
     StringCommandParser(Some("MM")).commands should be === Seq(MoveCommand, MoveCommand)
   }

   "StringCommandParser" should " return empty sequence" in {
     StringCommandParser(Some("")).commands should be === Seq()
     StringCommandParser(None).commands should be === Seq()
   }

   "StringCommandParser" should " create three Commands" in {
     StringCommandParser(Some("MLR")).commands should be === Seq(MoveCommand, TurnLeftCommand, TurnRightCommand)
   }

 }
