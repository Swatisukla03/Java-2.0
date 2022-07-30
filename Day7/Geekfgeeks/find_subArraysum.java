package Day7.Geekfgeeks;

public class find_subArraysum {
    public static void sum_subArray(int arr[],int n,int sum){
        int curr_sum,i,j;

        for( i=0;i<n;i++){
            curr_sum=arr[i];

            for(j=i+1;j<=n;j++){
                if(curr_sum==sum){
                    int p=j-1;
                    System.out.println("Index found from :"+i+ "to"+p);

                }
                if(curr_sum>sum || j==n)
                    break;

                    curr_sum=curr_sum+arr[j];
                


            }

        }
        // System.out.println("No subarray found");
        

    }
    public static void main(String args[]){
        int arr[]={15,2,4,8,9,10,23};
        int n=arr.length;
        int target=23;
        sum_subArray(arr,n,target);

    }
    
}
