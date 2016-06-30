import java.util.*;
import java.util.HashMap.*;


/**
 * Created by roman on 5/28/16.
 */
public class Player {

    int health = 100;

    /**
     * Sets the number of Player`s position.
     * @return returns the number of Player`s position.
     */
    public int numberOfPosition () {
        int a = (int) (Math.random() * 6);
        return a;
    }

    /*
    shootMethod generates and returns a random number from 0 to 6 to choose from injury ArrayList what part
    of enemy`s body to shoot.
    */
    public int shoot = shootMethod();
    public int shootMethod () {
        int b  = (int) (Math.random() * 6);
        return b;
    }

    /**
     * shootInBody() chooses, what part of enemy`s body is shot and returns object(type BodyPart) from injury ArrayList.
     */
    public BodyPart shootedPart = shootInBody();
    public BodyPart shootInBody ()
    {
       ArrayList<BodyPart> injury = new ArrayList<>();
        injury.add(new BodyPart(100, "head"));
        injury.add(new BodyPart (10, "rShoulder"));
        injury.add(new BodyPart(10, "lShoulder"));
        injury.add(new BodyPart (70, "chest"));
        injury.add(new BodyPart(10, "lHand"));
        injury.add(new BodyPart(10, "rHand"));
        injury.add(new BodyPart(50, "stomach"));

        BodyPart shot = injury.get(shoot);
        return shot;
    }



}






