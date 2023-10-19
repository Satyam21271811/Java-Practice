import java.util.*;
public class fullst{
    public static void main(String[] args) {
        
        System.out.println("enter char");
        Scanner scanner = new Scanner(System.in);
        char n= scanner.next().charAt(0);
        char s ='a';
        char m ='i';
        char b ='o';
        char d ='u';
        char e ='v';
        if(n==s || n==m || n==b || n==m || n==e){
            System.out.println("they are vowels");

        }else{
            System.out.println("this is consonent");
        }

    }
}