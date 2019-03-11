/*
*  Author: Critter Johnson
*  Date: 3/11/19
*  Purpose: Extending the Critter class
*/

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class BlusterCritter extends Critter
{
   private int c;
   
   // Constructor
   public BlusterCritter(int c) 
   {
      super();
      this.c = c;
   }

   // gets all neighboring actors w/in 2 steps
   public ArrayList<Actor> getActors()
   {
      ArrayList<Actor> actors = new ArrayList<Actor>();
      // gets all valid neighbors w/in 2 steps
      Grid gr = getGrid();
      int row = getLocation().getRow();
      int col = getLocation().getCol();
      Location curLoc;
      Actor a;
      
      for (int i = row - 2; i < row + 2; i++)
      {
         for (int j = col - 2; j < col + 2; j++)
         {
            curLoc = new Location(i, j);
            if (gr.isValid(curLoc))
            {
               a = (Actor) gr.get(curLoc);  // cast b/c .get returns an Object
               if (a != null)
                  actors.add(a);
            }
         }
      }
      
      return actors;
   }
   
   // if there are fewer than c Critters, brightens this BlusterCritter
   // otherwise, darkens
   public void processActors(ArrayList<Actor> actors)
   {
      // counts the Critters
      int countCritter = 0;
      for (Actor a : actors)
      {
         if (a instanceof Critter)
            countCritter++;
      }
      
      // brightens or darkens depending on the number of Critters
      Color color = getColor();
      // brightens
      if (countCritter < c)
      {
         // calculates the new color value
         int vals[] = {color.getRed(), color.getGreen(), color.getBlue()};
         int newVal;
         for (int i = 0; i < vals.length; i++)
         {
            newVal = (int) (vals[i] * (1 + 0.05));
            if (newVal < 255)
               vals[i] = newVal;
         }
         
         setColor(new Color(
            vals[0],
            vals[1],
            vals[2]));
      }
      // darkens
      else
      {
         setColor(new Color(
            (int) (color.getRed() * (1 - 0.05)),
            (int) (color.getGreen() * (1 - 0.05)),
            (int) (color.getBlue() * (1 - 0.05))));
      }
   }
}
