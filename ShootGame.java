/**
 * Created by roman on 5/28/16.
 */
public class ShootGame {
    Player red = new Player();
    Player green = new Player();

    public void startGame () {
    while (red.health > 0 && green.health > 0) {
        red.choosePosistion();
        System.out.println("Red position is " + red.choosePosistion());
        if (green.shootX() == red.choosePosistion())
        {
            red.health = red.health - green.shootY();
        }
        System.out.println("Red player health is " + red.health);

        green.choosePosistion();
        System.out.println("Green position " + green.choosePosistion());
        red.shootX();
        if (red.shootX() == green.choosePosistion())
        {
            green.health = green.health - red.shootY();
        }
        System.out.println("Green player health is " + green.health);
    }
    }
}
