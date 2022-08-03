package RECURSION;

import java.util.Scanner;

public class fact {

    public static int getfact(int n){
        if(n==0 ||n==1)
        return 1;

        return n*getfact(n-1);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=getfact(n);
        System.out.println(f);

    }
    
}
