package Day10;

import java.util.HashMap;

public class FindSum0 {
    public static void main(String args[]){
        int arr[]={15,-2,2,-8,1,7,10,23};
        int n=arr.length;
        getSum(arr, n);
        System.out.println(getSum(arr, n));
    //    System.out.println(getSum(arr),n);  

    }


    public static int getSum(int arr[],int n){
        HashMap<Integer,Integer>ans=new HashMap<Integer,Integer>();
        int max_len=0;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(arr[i]==0 && max_len==0)
            max_len=1;

            if(sum==0)
            max_len=i+1;


            Integer prev_i=ans.get(sum);

            if(prev_i !=null)
            max_len=Math.max(max_len,i-prev_i);
            else
            ans.put(sum,i);
        }
        return max_len;
    }
    
}
