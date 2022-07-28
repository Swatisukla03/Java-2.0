package Day5.GfgArray;

public class FindMin {
    public static void main(String args[]){
        int arr[]={3,4,5,1,23,14,65};
        int left = 0;
        int right = arr.length - 1;
        while(left < right) 
        {
            if(arr[left] < arr[right]) {
                System.out.print( arr[left]);

            }
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }

        }
        System.out.println(arr[left]);
               
    }
}
