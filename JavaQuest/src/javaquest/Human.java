
package javaquest;


public class Human {
    String name; //なまえ
    int hp; //ヒットポイント
    int strength; //ちから
    int agility; //すばやさ
    
    //コンストラクタ
    Human(String name, int hp, int strength, int agility){
        this.name=name;
        this.hp=hp;
        this.strength=strength;
        this.agility=agility;
    }
    
    String getName(){
        return name;
    }
    
    int getHp(){
        return hp;
    }
    
    int getStrength(){
        return strength;
    }
    
    int getAgility(){
        return agility;
    }
    
    
    
    void takedamage(int d){
        hp -= d;
    }
    
    
}
