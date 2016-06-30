/**
 * Created by roman on 5/28/16.
 */
public class ShootGame {

    /**
     * Two Players are created for the game.
     */
    Player red = new Player();
    Player green = new Player();

    public void startGame () {
        while (red.health > 0 && green.health > 0) {

            /**
             * Green Player aims on Red`s position.
             */
            green.shootMethod();

            /**
             * Green Player aims on Red`s part of body.
             */
            green.shootInBody();

            /**
             * Red Player takes his position.
             */
            System.out.println("Red position is " + red.numberOfPosition());

            /**
             * If Green Player aims on Red`s Position succesfully, he shoots Red`s body, if not - Green misses.
             */
            if (green.shoot == red.numberOfPosition()) {
                    red.health = red.health - green.shootedPart.injuryValue;
                    System.out.println("Green is shooting__________" + "Green hits " + green.shootedPart.name);
                } else {
                    System.out.println("Green missing!");
                }

            System.out.println("Red player health is " + red.health);

            /**
             * If Red`s health is more than after first shoot 0,he tries to aim on Green position and shoot Green`s body.
             */
            if (red.health != 0) {
                red.shootMethod();
                red.shootInBody();
                System.out.println("Red is shooting__________" + "Green position is " + green.numberOfPosition());
            } else {
                break;
            }

            if (red.shoot == green.numberOfPosition()) {
                    green.health = green.health - red.shootedPart.injuryValue;
                    System.out.println("Red hits " + red.shootedPart.name);
            } else {
                System.out.println("Red missing!");
            }
            System.out.println("Green player health is " + green.health);
        }
        /**
         * The winner of the game is printed out.
         */

        if (red.health != 0) {
            System.out.println("Red wins!");
        } else {
            System.out.println("Green wins!");
        }
    }
}
