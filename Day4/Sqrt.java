package Day4;

import java.util.Scanner;

public class Sqrt {
    public static void main(String args[]){
        System.out.println("Enter the number :");
        Scanner sc=new Scanner( System.in);
        int num=sc.nextInt();
        // scanner.close();
        System.out.println("Square root is :"+num+ "is "+squareRoot(num));
    }
    public static double squareRoot(int number){
        double temp;
        double sr=number/2;

        do{
            temp=sr;
            sr=(temp+(number/temp))/2;
        }while((temp-sr) !=0);

        return sr;

    }
    

    
}
