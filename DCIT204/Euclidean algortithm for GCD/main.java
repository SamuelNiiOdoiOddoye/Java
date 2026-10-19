import java.util.Scanner;

public class main{

    public static void GCD(int a,int b){
        int g= 0;
       for(int i=1;i<=a;i++){
        if( a%i == 0 && b%i == 0)
             g=i;
       }
       System.out.println("GCD = "+g);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World, Enter any two numbers:");
        int a= sc.nextInt();
        int b =sc.nextInt();

        GCD(a, b);
    
    }
}