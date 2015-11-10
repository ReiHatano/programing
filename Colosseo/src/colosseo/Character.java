/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colosseo;



abstract class Character {
    
    String name;
    int hp;
    int strength;
    int fitness;
    
    //コンストラクタ
    public Character(String name, int hp, int strength, int fitness){
        this.name=name;
        this.hp=hp;
        this.strength=strength;
        this.fitness=fitness;
        
    }  
        public String getName(){
            return name;
        }
        
        public int getHp(){
            return hp;
        }
        
        public int getStrength(){
            return strength;
        }
        
        public int getFitness(){
            return fitness;
        }
        
       
        
    
}
