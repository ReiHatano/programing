/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colosseo;

public class Util {

    // さいころを振ります
    public static int rollDice() {
        return new java.util.Random().nextInt(6) + 1; //サイコロをふる
    }
}