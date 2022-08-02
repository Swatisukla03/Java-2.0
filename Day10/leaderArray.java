package Day10;

import java.util.ArrayList;
import java.util.Collections;

import Day7.CollectionFrame.arraylist;

public class leaderArray {
    public static ArrayList<Integer> getleader1(int arr[]){
        ArrayList<Integer>ans=new ArrayList<>();
        int rmax=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=rmax){
                ans.add(arr[i]);
                rmax=arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;

    }







    public static void getLeader(int arr[],int n){
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(arr[i]<=arr[j])
                break;



            }
            if(j==n){
                System.out.print(arr[i]+" ");
            }



        }







    }
    public static void main(String args[]){
        int arr[]={16,17,4,3,5,2};
        // int n=arr.length;
        // getLeader(arr, n);
       ArrayList<Integer>ans=getleader1(arr);
    //    for(int i=0;i<arr.length;i++){
        System.out.print(ans+" ");
    //    }

    }
    
}
