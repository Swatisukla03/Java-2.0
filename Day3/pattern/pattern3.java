package Day3.pattern;

import java.util.Scanner;

public class pattern3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int row=sc.nextInt();
        // int row=5;
        for(int i=0;i<row;i++){
            for(int j=row-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
}
