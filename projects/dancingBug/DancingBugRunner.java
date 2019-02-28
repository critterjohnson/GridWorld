/*
*  Author: Critter Johnson
*  Date: 2/25/19
*/


import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        
        int[] turns = new int[] {12, 3, 52, 4, 5, 7, 2, 4, 9, 6, 7};
        
        DancingBug boogie = new DancingBug(turns);
        boogie.setColor(Color.ORANGE);
        world.add(new Location(7, 8), boogie);
        world.show();
    }
}