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


    public String bodyPart = bodyMap();
    public String bodyMap() {

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

    public int injury ()
    {
       HashMap<String,Integer> injury = new HashMap<>();
        injury.put("head",100);
        injury.put("rShoulder",10);
        injury.put("lShoulder",10);
        injury.put("chest",70);
        injury.put("lHand",10);
        injury.put("rHand",10);
        injury.put("stomach",50);

        int shootY = injury.get(bodyPart);
        return shootY;


    }



}






