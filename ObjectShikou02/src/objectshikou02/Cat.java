
package objectshikou02;


public class Cat extends Animal {
    private final int age;
    
    //コンストラクタ
    public Cat(String name, int age){
        super(name);
        this.age=age;
    }
    
    @Override
    public void bark(){
        System.out.println("にゃーにゃー");
    }
    @Override
    public String toString(){
        return age + "歳の" + getName();
    }
}
