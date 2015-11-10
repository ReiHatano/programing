
package summachine;
import java.util.Scanner;

public class SumMachine {
    
    static int calc(int n){
        int sum = 0;
        for(int i =1; i <= n; i++){
            sum += i;
                    
        }
        return sum;
    }

    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("１からｘまでの和を求める");
        int x;
        
        do{
            System.out.println("ｘの値：");
            x = stdIn.nextInt();
            
        }while(x <= 0);
        
        System.out.println("答えは"+ calc(x));
    }
    
}
