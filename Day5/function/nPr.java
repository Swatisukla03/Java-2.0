package Day5.function;

import java.util.Scanner;

public class nPr {
    public static void display(int n,int r,int npr){
        System.out.println(n+"P"+r+"="+npr);
    }


    public static int fact(int x){
        int reteurn_val=1;
        for(int i=1;i<=x;i++){
            reteurn_val*=i;
        }
        return reteurn_val;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int r=sc.nextInt();
        int nfact=fact(n);
        int nmrfact=fact(n-r);
        int npr=nfact/nmrfact;
        // System.out.println(n+"P"+r+"="+npr);
        display(n, r,npr);

    }
    
}
