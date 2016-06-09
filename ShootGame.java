/**
 * Created by roman on 5/28/16.
 */
public class ShootGame {
    Player red = new Player();
    Player green = new Player();

    public void startGame () {
        while (red.health > 0 && green.health > 0) {

            System.out.println("_________Green is shooting__________");

            red.choosePosistion();
            System.out.println("Red position is " + red.choosePosistion());
            green.shootX();

            if (green.shootX() == red.choosePosistion()) {
                System.out.println("Green hits " + green.bodyPart());
                red.health = red.health - green.shootY();

            } else {
                System.out.println("Green missing!");
            }
            System.out.println("Red player health is " + red.health);

            System.out.println("__________Red is shooting__________");

            green.choosePosistion();
            System.out.println("Green position is " + green.choosePosistion());
            red.shootX();
            if (red.shootX() == green.choosePosistion()) {
                System.out.println("Red hits " + red.bodyPart());
                green.health = green.health - red.shootY();

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
