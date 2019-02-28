/*
*  Author: Critter Johnson
*  Date: 2/25/19
*/


import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class ZBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        ZBug boogie = new ZBug(6);
        boogie.setColor(Color.ORANGE);
        ZBug woogie = new ZBug(3);
        world.add(new Location(7, 8), boogie);
        world.add(new Location(5, 5), woogie);
        world.show();
    }
}