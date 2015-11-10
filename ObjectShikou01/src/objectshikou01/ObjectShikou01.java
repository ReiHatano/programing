
package objectshikou01;
import java.util.Scanner;

public class ObjectShikou01 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
     
        
        SkyWalker p = new SkyWalker("スカイウォーカ", 0, 0,50.0);
        System.out.println("名前:"+p.getName());
        System.out.println("出発地点X座標"+p.getX());
        System.out.println("出発地点Y座標"+p.getY());
        System.out.println("燃料"+p.getFuel());
        
        while(0<p.getFuel()){
        System.out.println("移動したいX座標を入力してください");
        System.out.print("X座標：");  double dx = stdIn.nextDouble();
        System.out.println("移動したいY座標を入力してください");
        System.out.print("Y座標：");  double dy = stdIn.nextDouble();
        
        p.move(dx, dy);
        
        System.out.println("現在地："+ p.getX() +"," + p.getY());
        System.out.println("残りの燃料："+ p.getFuel());
      
        }
        if(p.getFuel()<0){
            System.out.println("燃料がなくなりました！");
        }
    }
    
}
