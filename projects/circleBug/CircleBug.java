/*
*  Author: Critter Johnson
*  Date: 2/25/19
*  Purpose: GridWorld Case Study 2
*/

import info.gridworld.actor.Bug;


public class CircleBug extends Bug
{
   private int steps, sideLength;
   
   // CONSTRUCTOR
   public CircleBug(int length)
   {
      steps = 0;
      sideLength = length;
   }
   
   
   
   // METHODS 
   // moves the bug unless there's something in front of it
   public void act()
   {
      if (steps < sideLength && canMove())
      {
         move();
         steps++;
      }
      else
      {
         turn();
         steps = 0;
      }
   }
}
