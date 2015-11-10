
package objectshikou02;


abstract class Animal {
    private final String name;
    
    //コンストラクタ
    public Animal(String name){
        this.name=name;
        
    }
    
    public abstract void bark();
    
    public String getName(){
        return name;
    }
    @Override
    public abstract String toString();
    public void introduce(){
        System.out.println(toString() + "だ");
    }
    
}
