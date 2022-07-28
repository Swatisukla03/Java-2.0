package Day5.function;

import java.util.Scanner;

public class DigitFreq {


    public static int freq(int n,int d){
        int ret_val=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            if(digit==d){
                ret_val++;
            }
        }
        return ret_val;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int f=freq(n, d);
        System.out.println(f);
        
    }
    
}
