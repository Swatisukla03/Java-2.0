package Day4.Important;
//num is=987605

import java.util.Scanner;

public class rotateNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num:");
        int num=sc.nextInt();
        System.out.println("Enter no of times");
        int k=sc.nextInt();
        int nod=0;
        int temp=num;
        while(temp>0){
            temp=temp/10;
            nod++;
        }
        k=k%nod; //for handling more than 5 times rotation
        if(k<0){  //for handling negative num
            k=k+nod;
        }
        int mul=1;
        int div=1;
        for(int i=1;i<=nod;i++){
            if(i<=k){
                div=div*10;
            }
            else{
                mul=mul*10;
            }
        }
        int rem=num%div;
        int n=num/div;
        int new_num=rem*mul+n;
        System.out.println(new_num);
    }
    
}
