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
public class Sword extends Item{
    private int power;
    //コンストラクタ
    public Sword(String name,int price,int power){
        super(name,price);
        this.power=power;
        
    }
    public void setEquip(){
        Charactor.setStrength(int strength);
    }
}
