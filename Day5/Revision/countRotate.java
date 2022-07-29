package Day5.Revision;

public class countRotate {
    public static int NoRotate(int arr[],int n){
        // int ret_val=0;
        int min=arr[0];
        int min_index=0;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                min_index=i;
            }
        }
        return min_index;

    }
    public static void main (String args[]){
        int arr[]={7,8,11,2,3,4,6};
        int n=arr.length;
        int check_no_times=NoRotate(arr, n);
        System.out.println(check_no_times);

    }
    
}
