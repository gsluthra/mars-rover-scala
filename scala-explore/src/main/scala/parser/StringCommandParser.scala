package parser

import commands.{TurnRightCommand, TurnLeftCommand, MoveCommand, RoverCommand}

case class StringCommandParser(commandString: Option[String]){
  def commands: Seq[RoverCommand] = {
     commandString.getOrElse("").map{
       case 'M' => MoveCommand
       case 'L' => TurnLeftCommand
       case 'R' => TurnRightCommand
     }
  }
}
