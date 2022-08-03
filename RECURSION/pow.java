package RECURSION;

import java.util.Scanner;

public class pow {

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        System.out.println(getpow(x, n));

    }

    public static int getpow(int x,int n){
        if(n==0)
        return 1;

        return getpow(x, n-1)*x;

    }
    
}
