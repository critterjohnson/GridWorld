import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

/**
 * This class runs a world that contains crab critters. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class KingCrabRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(3, 5), new Rock());
        world.add(new Location(3, 3), new Rock());
        world.add(new Location(3, 6), new Rock());
        world.add(new Location(3, 9), new Rock());
        world.add(new Location(4, 5), new KingCrab());
        world.show();
    }
}