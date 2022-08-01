package Day9;

import java.nio.channels.AsynchronousSocketChannel;
import java.util.Arrays;

import Day2.swapTwo;

public class Sort1s0s {
    public static void SwapArray(int arr[],int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }


    public static void sortArray(int arr[],int n){
        int l=0;
        int m=0;
        int h=n-1;
        while(m<=h){
            int x=arr[m];
            if(x==0){
                SwapArray(arr, l, m);
                l++;
                m++;
            }
            else if(x==1)
            m++;

            else{
                SwapArray(arr, h, m);
                h--;
            }



        }
    }

    public static void main(String args[]){
        int arr[]={0,1,0,2,2,0,0,1,2};
        int n=arr.length;
        sortArray(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    
}
