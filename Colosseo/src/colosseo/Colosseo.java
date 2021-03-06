
//敵キャラクタが５体くらいいて戦闘は勇者と１対１ですが、敵の順番は毎回ランダムに決まります。勇者が最後まで生き残ればハッピーエンド。
//敵を倒すとアイテムをランダムにドロップして、それを装備してstrength等のステータスが上がる仕組みも入れたいです。
//そんなゲームをつくりたいと考えてます。

package colosseo;

/**
 *
 * @author Rei Hatano
 */
public class Colosseo {

    
     
    public static void main(String[] args) {
        
        
        Charactor ortega = new Hero("オルテガ",100,8);
        Charactor skeleton = new Skeleton("スケルトン",40,7);
        Charactor smith = new Zombie("スミス",110,4);
        Charactor baramos = new Baramos("バラモス",300,15);
        
        battle(new Charactor[]{ortega, skeleton});
        Sword LongSword = new Sword("ロングソード",5);
 
        battle(new Charactor[]{ortega, smith});
        battle(new Charactor[]{ortega, baramos});
    }
    
    
        public static void battle(Charactor[] charactors) {
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
    

