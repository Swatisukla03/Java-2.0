package Day5.GfgArray;

import java.util.Scanner;

public class RotateAnArray {

    public static void rotate(int arr[], int n){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // Scanner sc=new Scanner(System.in);
        // int no=sc.nextInt(); //no of times rotation
       

        for(int i=0;i<n;i++){
            int first=arr[0];
            
            for( int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];

            }
            arr[arr.length-1]=first;
        }
        System.out.println();
        System.out.println("After Rotation :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
    public static void main(String args[]){
        int arr[]={34,12,13,46,78,14};
         int n=3;
         rotate(arr, n);
    }
    
}
