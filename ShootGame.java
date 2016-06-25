/**
 * Created by roman on 5/28/16.
 */
public class ShootGame {
    Player red = new Player();
    Player green = new Player();

    public void startGame () {
        while (red.health > 0 && green.health > 0) {

            System.out.println("_________Green is shooting__________");
            green.shootMethod();
            green.shot();
            System.out.println("Red position is " + red.position());
                if (green.shoot == red.position()) {
                    red.health = red.health - green.shotPart.injuryValue;
                    System.out.println("Green hits " + green.shotPart.name);
                } else {
                    System.out.println("Green missing!");
                }
            System.out.println("Red player health is " + red.health);

            if (red.health != 0) {
                System.out.println("__________Red is shooting__________");
                red.shootMethod();
                red.shot();
                System.out.println("Green position is " + green.position());
            } else {
                break;
            }

            if (red.shoot == green.position()) {
                    green.health = green.health - red.shotPart.injuryValue;
                    System.out.println("Red hits " + red.shotPart.name);
                } else {
                System.out.println("Red missing!");
            }
            System.out.println("Green player health is " + green.health);
        }
        if (red.health != 0) {
            System.out.println("Red wins!");
        } else {
            System.out.println("Green wins!");
        }
    }


}
