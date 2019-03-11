import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import java.awt.Color;

import java.awt.Color;

public class BlusterCritterRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        BlusterCritter bluster = new BlusterCritter(3);
        bluster.setColor(new Color(125, 0, 0));
        world.add(new Location(0, 0), bluster);
        world.add(new Location(4, 4), new Critter());
        world.add(new Location(5, 8), new Critter());
        world.add(new Location(6, 4), new Critter());
        world.add(new Location(7, 8), new Critter());
        world.add(new Location(8, 4), new Critter());
        world.add(new Location(9, 8), new Critter());
        world.show();
    }
}