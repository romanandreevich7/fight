import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by roman on 5/28/16.
 */
public class Player {

    double health = 100;

    public static int choosePosistion ()
    {
        int positionX = (int)Math.random()*6;
        return positionX;
    }

    public int shootX () {
        int shoot = (int)Math.random()*6;
        return shoot;
    }
    public int shootY () {
        int shoot = (int)Math.random()*7;
        ArrayList<String> bodyList = new ArrayList<String>();
        bodyList.add("head");
        bodyList.add("rShoulder");
        bodyList.add("lShoulder");
        bodyList.add("chest");
        bodyList.add("lHand");
        bodyList.add("rHand");
        bodyList.add("stomach");
        String part = bodyList.get(shoot);

        HashMap <String, Integer> inj = new HashMap<String, Integer>();
        inj.put ("head", 100);
        inj.put ("rShoulder", 10);
        inj.put ("lShoulder", 10);
        inj.put ("chest", 70);
        inj.put ("lHand", 10);
        inj.put ("rHand", 10);
        inj.put ("stomach", 50);

        shoot = inj.get(part);

        return shoot;
    }
}
