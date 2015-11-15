/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test03;

/**
 *
 * @author Rei Hatano
 */
public class BattleSystem {
    
     public static void battle(ICharactor[] charactors) {
        int turn = 0;
        while (charactors[0].isAlive() && charactors[1].isAlive()) {

            System.out.println("【" + charactors[turn].getName() + "のターン】");
            System.out.println("");

            charactors[turn].doAction(charactors[1-turn]);

            System.out.println("--------------------------");
            for (int i = 0; i < 2; i++) {
                System.out.println(charactors[i].getName() + "のHPは" + charactors[i].getHp());           // それぞれのHPを表示
            }
            System.out.println("--------------------------");
            System.out.println("エンターキーを押して下さい");
            new java.util.Scanner(System.in).nextLine();
            System.out.println("");
            
            turn = 1 - turn;
        }

        if (!charactors[0].isAlive()) {                                                                                          //勇者のHPが０以下になってしまったときのエンディング
            System.out.println(charactors[0].getName() + "は戦いに敗れた。");
            System.out.println("世界は破滅した・・。");
        } else if (!charactors[1].isAlive()) {                                                                                  //大魔王のHPが0以下になったときのエンディング
            System.out.println(charactors[1].getName() + "を倒した！");
            System.out.println("ふたたび世界に平和が訪れた。");
        }
    }
}
