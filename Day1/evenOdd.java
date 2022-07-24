import java.util.Scanner;

public class evenOdd {
    public static void main(String [] args){
        System.out.println("Even or Odd ?");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
    
}
