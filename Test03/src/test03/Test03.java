
package test03;

public class Test03 {

    public static void main(String[] args) {
        openning();
        ICharactor ortega = new Ortega("勇者オルテガ", 50, 7);
        ICharactor zohma = new Zohma("大魔王ゾーマ", 70, 8);
        BattleSystem.battle(new ICharactor[]{ortega, zohma});   
    }

    public static void openning() {
        System.out.println("大魔王ゾーマが現れた！");
        System.out.println("大魔王ゾーマとの戦いが始まった！");
        System.out.println("");
    }
       
   
}