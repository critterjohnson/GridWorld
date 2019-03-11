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

public class QuickCrab extends CrabCritter
{
   // gets the empty locations two spaces away to the left or right
   // if the space isn't empty, gets the space immdiately to the left or right
   public ArrayList<Location> getMoveLocations()
   {
      // gets empty locations two spaces away
      int[] dirs = {Location.LEFT, Location.RIGHT};
      ArrayList<Location> locs = new ArrayList<Location>();
      Location oneLoc;
      Location twoLoc;
      for (int dir : dirs)
      {
         oneLoc = getLocation().getAdjacentLocation(getDirection() + dir);
         if (getGrid().isValid(oneLoc))
         {
            if (getGrid().get(oneLoc) == null)
            {
               twoLoc = oneLoc.getAdjacentLocation(getDirection() + dir);
               if (getGrid().isValid(twoLoc))
                  if (getGrid().get(twoLoc) == null)
                     locs.add(twoLoc);
            }
         }
      }
      
      // if there were no valid locations
      if (locs.size() == 0)
         return super.getMoveLocations();
      
      return locs;
   }
}
