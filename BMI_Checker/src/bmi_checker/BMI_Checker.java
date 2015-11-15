
package bmi_checker;

import java.util.Scanner;
public class BMI_Checker {

   
    public static void main(String[] args) { 
      Calc();
      System.out.print("ご利用ありがとうございました。"); 
      }
    
    public static void Calc(){
        Scanner input = new Scanner(System.in);
        int retry;
    do{
    System.out.print("あなたの体重を入力してください（単位はKｇです）:");  
    double a = input.nextDouble(); 
    System.out.println(a+ "kg");
     System.out.print("あなたの身長を入力してください（単位はセンチメートルです）:"); 
    double b = input.nextDouble(); 
    System.out.println(b+ "cm");
    b=b/10.0;
    double BMI=(a/b/b)*100;
    System.out.println("あなたのBMIは"+BMI+"です。");
        if(BMI<18.0){
                System.out.println("あなたは痩せすぎです。");
                }
        else if (18.0<=BMI && BMI<25.0){
                System.out.println("あなたは標準体型です。");
                }
               else if (25.0<BMI){
               System.out.println("あなたは太り過ぎです。");
                }
    
    System.out.println("もう一度行いますか？　１：はい　　２：いいえ");
      retry = input.nextInt(); 
       }while(retry==1);
    }
    
   
}
