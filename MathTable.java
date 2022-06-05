import java.util.Scanner;

public class MathTable{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int n = sc.nextInt();
          
        System.out.println("-----------------------------------------");
        for(int i=1; i < 11; i++){
           
           System.out.println( i * n);
        }

    }

}