package Day3.basicProblem;

import java.util.Scanner;

public class Iprime {

    

public static void main(String args[]){
    Scanner sc=new Scanner((System.in));
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int num=sc.nextInt();
        int count=0;
        for(int div=1;div<=num;div++){
            if(num%div==0){
                count++;
                break;
            }

            

        }
        if(count==2){
            System.out.println(num);
        }
        else{
            System.out.println();
        }
    }
  
}
}