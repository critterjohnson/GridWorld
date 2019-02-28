/*
*  Author: Critter Johnson
*  Date: 2/25/19
*  Purpose: GridWorld Case Study 2
*/

import info.gridworld.actor.Bug;

public class SpiralBug extends Bug
{
   private int steps;
   private int sideLength;

   // CONSTRUCTOR
   public SpiralBug(int length)
   {
      steps = 0;
      sideLength = length;
   }

   
   
   // METHODS
   // acts?
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
         turn();
         steps = 0;
         sideLength++;
      }
   }
}
