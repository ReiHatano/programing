
package colosseo;


abstract class Charactor {
    
   protected String name;
   protected int hp;
   protected int strength;
    
 
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
        
         public boolean isAlive() {
        return 0 < hp;
    }
        
       public void doAction(Charactor opponent){
           switch (Util.rollDice()) {
            case 1:
                doNo1(opponent);
                return;
            case 2:
                doNo2(opponent);
                return;
            case 3:
                doNo3(opponent);
                return;
            case 4:
                doNo4(opponent);
                return;
            case 5:
                doNo5(opponent);
                return;
            case 6:
                doNo6(opponent);
                return;
        }
       }
        
    
}