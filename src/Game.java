import java.util.Scanner;

/**
 * Created by cameronoakley on 10/8/15.
 */
public class Game {
    public static void run() throws Exception {
        System.out.println("Welcome to the Jungle" );

        Player player =  new Player ();
        player.chooseName();
        player.chooseWeapon();
        player.chooseArea();
    }
}
