import java.util.*;
import java.util.HashMap.*;


/**
 * Created by roman on 5/28/16.
 */
public class Player {

    int health = 100;


    public int position () {
        int a = (int) (Math.random() * 6);
        return a;
    }


    public int shoot = shootMethod();
    public int shootMethod () {
        int b  = (int) (Math.random() * 6);
        return b;
    }


    public BodyPart shotPart = shot();
    public BodyPart shot ()
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






