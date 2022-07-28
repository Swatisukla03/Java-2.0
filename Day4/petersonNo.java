package Day4;

import java.util.Scanner;

public class petersonNo {

    static long factorial[]={1,1,2,6,24,120,720,5040};
    static boolean isPeterson(int n){
        int num=n;
        int sum=0;
        while(n>0){
        int digit=n%10;
        sum+=factorial[digit];
        n=n/10;
        }
        return(sum==num);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner( System.in);
        System.out.println("Enter the number to check :");
        int n=sc.nextInt();
        if(isPeterson(n)){
            System.out.println("Yes,it is a Peterson number");
        }
        else{
            System.err.println("No it is not");
        }

    }
    
}
