/*
*  Author: Critter Johnson
*  Date: 2/28/19
*  Purpose: GridWorld part 3
*/

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class JumperRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        Jumper bob = new Jumper();
        world.add(new Location(5, 5), bob);
        world.show();
    }
}
