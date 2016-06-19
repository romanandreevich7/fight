import java.util.*;
import java.util.HashMap.*;


/**
 * Created by roman on 5/28/16.
 */
public class Player {

    double health = 100;

    public  int choosePosistion() {
        int positionX = (int) (Math.random() * 6);
        return positionX;
    }

    public int shootX() {
        int shoot = (int) (Math.random() * 6);
        return shoot;
    }

    public String bodyPart() {

        int shoot = (int) (Math.random() * 7);
        ArrayList<String> bodyList = new ArrayList<String>();
        bodyList.add("head");
        bodyList.add("rShoulder");
        bodyList.add("lShoulder");
        bodyList.add("chest");
        bodyList.add("lHand");
        bodyList.add("rHand");
        bodyList.add("stomach");
        String part = bodyList.get(shoot);

        return part;

    }

    public int shootY ()
    {
        Map<String, Integer> inj = new HashMap<>();
        inj.put("head",100);
        inj.put("rShoulder",10);
        inj.put("lShoulder",10);
        inj.put("chest",70);
        inj.put("lHand",10);
        inj.put("rHand",10);
        inj.put("stomach",50);

        int shootY = inj.get(bodyPart());
        return shootY;


    }



}






