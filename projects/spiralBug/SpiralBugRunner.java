/*
*  Author: Critter Johnson
*  Date: 2/25/19
*/


import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class SpiralBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        SpiralBug boogie = new SpiralBug(1);
        boogie.setColor(Color.ORANGE);
        world.add(new Location(7, 8), boogie);
        world.show();
    }
}