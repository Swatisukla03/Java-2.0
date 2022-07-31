package Day8.geeksForGeeks;

import Day5.stackpro;

public class FindMissing {

    public static int findMissing(int arr[],int n){
        int total_sum=((n+1)*(n+2))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int num=total_sum-sum;
        return num;



    }


    public static void main(String args[]){
        int arr[]={1,2,3,5};
        int n=arr.length;
        int missing_num=findMissing(arr, n);
        System.out.println(missing_num);

    }
    
}
