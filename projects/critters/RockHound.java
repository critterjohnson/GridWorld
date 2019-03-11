/*
*  Author: Critter Johnson
*  Date: 3/11/19
*  Purpose: Extending the Critter class
*/

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class RockHound extends Critter
{
   public void processActors(ArrayList<Actor> actors)
   {
      for (Actor a : actors)
      {
         if (a instanceof Rock)
            a.removeSelfFromGrid();
      }
   }
}
