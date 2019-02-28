/*
*  Author: Critter Johnson
*  Date: 2/26/19
*  Purpose: GridWorld Case Study 2 ex 4
*/

import info.gridworld.actor.Bug;

class DancingBug extends Bug
{
   int[] turns;
   int curStep;
   
   // CONSTRUCTOR
   public DancingBug(int[] turns)
   {
      this.turns = turns;
      curStep = 0;
   }
   
   
   
   // METHODS
   public void act()
   {
      if (curStep >= turns.length) {curStep = 0;}
      
      for (int i = 0; i < turns[curStep]; i++)
      {
         turn();
      }
      
      curStep++;
      super.act();
   }
}
