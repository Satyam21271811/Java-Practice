import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("enter year");
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0){
             if(year%100==0){
                 if(year%400==0){
                     System.out.println("this is leap year");
                 }else{
                  System.out.println("this is not leap year");
                 }
             }else{
                 System.out.println("this is not leap year");
             }
         }else{
             System.out.println("this is not leap year");
         }
    }
    
}
