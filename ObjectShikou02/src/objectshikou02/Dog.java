
package objectshikou02;


 class Dog  extends Animal{
    private final String type;
    
    //コンストラクタ
    public Dog(String name, String type){
        super(name);
        this.type=type;
    }
    
    @Override
    public void bark(){
        System.out.println("わんわんっ！");
    }
    
    @Override
    public String toString(){
        return type + "の" + getName();
    }
    
}
