package Day5.GfgArray;

public class FindSmallest {
    public static void main(String args[]){
        int arr[]={4,5,6,7,8,0,1,3};
        int low=1;
        int high=arr.length;
        if(arr[low]<=arr[high]){
            System.out.print(arr[0]);
        }
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]>arr[mid+1]){
                System.out.println(arr[mid]+1);
            }
            else if(arr[mid]<=arr[mid-1]){
                System.out.println(arr[mid]);
            }
            else if(arr[low]<=arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

    }
    
}
