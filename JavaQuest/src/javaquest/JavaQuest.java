
package javaquest;

/**
 *
 * @author Rei Hatano
 */
public class JavaQuest {

    public static void main(String[] args) {
       Human ortega = new Human("オルテガ", 50, 7, 5);
       Human hassan = new Human("ハッサン", 80, 12, 1);
       Human shidoh = new Human("シドー",100, 8, 1);
       Human zohma = new Human("ゾーマ",70, 8, 3);
       
       ortega.takedamage(10); //オルテガ１０ダメージうける
       hassan.takedamage(20); //ハッサン２０ダメージうける
       
       System.out.println(ortega.hp);
    }
    
}
