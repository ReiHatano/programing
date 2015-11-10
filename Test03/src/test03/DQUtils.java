
package test03;


public class DQUtils {

    // さいころを振ります
    public static int rollDice() {
        return new java.util.Random().nextInt(6) + 1; //サイコロをふる
    }
}