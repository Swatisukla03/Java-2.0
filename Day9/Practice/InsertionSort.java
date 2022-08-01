package Day9.Practice;

import java.util.Arrays;

public class InsertionSort {
    public static void insertSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                int temp;
                if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String args[]){
        int arr[]={4,5,78,9,12};
        int n=arr.length;
        insertSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    
}
