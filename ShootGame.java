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
            System.out.println("Red position is " + red.position());
                if (green.shoot == red.position()) {
                    red.health = red.health - green.injury();
                    System.out.println("Green hits " + green.bodyMap());
                } else {
                    System.out.println("Green missing!");
                }
            System.out.println("Red player health is " + red.health);

            if (red.health != 0) {
                System.out.println("__________Red is shooting__________");
                red.shootMethod();
                System.out.println("Green position is " + green.position());
            } else {
                break;
            }

            if (red.shoot == green.position()) {
                    green.health = green.health - red.injury();
                    System.out.println("Red hits " + red.bodyMap());
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
