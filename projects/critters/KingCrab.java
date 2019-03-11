/*
*  Author: Critter Johnson
*  Date: 3/11/19
*  Purpose: Extending the CrabCritter class
*/

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class KingCrab extends CrabCritter
{
   // moves actors a space away if possible, otherwise kills it
   public void processActors(ArrayList<Actor> actors)
   {
      int dir;
      Location loc = getLocation();
      Location newLoc;
      Grid gr = getGrid();
      
      for (Actor a : actors)
      {
         dir = loc.getDirectionToward(a.getLocation());  // gets the direction to move in
         newLoc = a.getLocation().getAdjacentLocation(dir);  // gets the location in the proper direction
         // if it is valid, moves there, otherwise, removes it
         if (gr.isValid(newLoc))
            a.moveTo(newLoc);
         else
            a.removeSelfFromGrid();
      }
   }
}
