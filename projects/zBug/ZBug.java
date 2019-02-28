/*
*  Author: Critter Johnson
*  Date: 2/26/19
*  Purpose: GridWorld Case Study 2 ex 3
*/

import info.gridworld.actor.Bug;

class ZBug extends Bug
{
   int length, steps, turns;
   
   // CONSTRUCTOR
   public ZBug(int length)
   {
      this.length = length;
      setDirection(90);
      steps = 0;
      turns = 0;
   }
   
   
   
   // METHODS
   public void act()
   {
      if (steps < length)
      {
         move();
         steps++;
      }
      // turns the bug
      else
      {
         if (turns == 0)
         {
            setDirection(225);
            turns++;
            steps = 0;
         }
         else if (turns == 1)
         {
            setDirection(90);
            turns++;
            steps = 0;
         }
      }
   }
}
