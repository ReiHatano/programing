
package objectshikou01;


public class SkyWalker {
    private String name; //なまえ
    private double x; //x座標
    private double y; //y座標
    private double fuel; //燃料
    
    //コンストラクタ
    public SkyWalker(String name , double x , double y , double fuel){
        this.name = name;
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }
    
    
    
    public String getName(){  //なまえ取得
        return name;
    }
    
    
    public double getX(){  //現在位置X座標を取得
        return x;
    }
    
    public double getY(){  //現在位置Y座標を取得
        return y;
    }
    
    public double getFuel(){  //現在の残り燃料を取得
        if (fuel <0){
            fuel = 0;
        }
        return fuel;
    }
    

    

  //移動システム
public double move(double dx, double dy){
    double dist = Math.sqrt(dx*dx + dy*dy);    //平方根だす
    
       return fuel -= dist;
        
         return x +=dx; //どうすればいいんですか！？（泣）
         y +=dy;
    }
}



