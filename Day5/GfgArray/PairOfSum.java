package Day5.GfgArray;

import Day4.sumN;

public class PairOfSum {
     static boolean checkSum(int arr[],int n,int x){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int r=i;
                int l=(i+1)%n;
                while(l!=r){
                    if(arr[l]+arr[r]==x)
                    return true;
                    if(arr[l]+arr[r]>x)
                    r=(n+r-1)%n;
                    else
                    l=(l+1)%n;
                }
               
            }
        //  return false;
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={11,5,67,8,9};
        int sum=16;
        int n=arr.length;
        if(checkSum(arr, n, sum)){
            System.out.println("Pair exist");

        }
        else{
            System.out.println("No Pair exist ");
        }
    }
    
}
