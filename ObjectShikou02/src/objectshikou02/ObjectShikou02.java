
package objectshikou02;

public class ObjectShikou02 {

   
    public static void main(String[] args) {
        Animal[] a = new Animal[2];
        a[0]= new Dog("まめすけ","柴犬");
        a[1]= new Cat("にゃんまる",2);
        
        for(int i=0; i<a.length;i++){
            System.out.println(a[i].getName() + " ");
            
            a[i].bark();
            a[i].introduce();
            
        }
        
        
    }
    
}
