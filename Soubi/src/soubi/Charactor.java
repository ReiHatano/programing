/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soubi;

/**
 *
 * @author Rei Hatano
 */

    abstract class Charactor {
    
   private String name;
   private int hp;
   private int strength;
    
 public Charactor(String name, int hp, int strength){
        this.name=name;
        this.hp=hp;
        this.strength=strength;
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
        
         public void setStrength(int strength) {
        this.strength = strength;
    }
}
