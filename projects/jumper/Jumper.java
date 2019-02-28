/*
*  Author: Critter Johnson
*  Date: 2/28/19
*  Purpose: GridWorld part 3
*/

import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Jumper extends Bug
{
   // METHODS
   public void move()
   {
      Grid<Actor> gr = getGrid();
      if (gr == null)
         return;
      Location loc = getLocation();
      // this is where the code diverges from Bug
      // gets the space two spaces in front of this
      Location next = loc.getAdjacentLocation(getDirection())
         .getAdjacentLocation(getDirection());
      
      if (gr.isValid(next))
      {
         moveTo(next);
      }
      else
         removeSelfFromGrid();  
   }
   
   public boolean canMove()
   {
      Grid<Actor> gr = getGrid();
      if (gr == null)
         return false;
      Location loc = getLocation();
      Location next = loc.getAdjacentLocation(getDirection())
         .getAdjacentLocation(getDirection());
      if (!gr.isValid(next))
         return false;
      Actor check = gr.get(next);
      return (check == null || check instanceof Flower);
   }
}
