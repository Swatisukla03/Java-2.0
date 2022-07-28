package Day5.GfgArray;

public class RotationCount {
    public static int RotationCount(int arr[]){
        int min=arr[0];
        int min_index=0;
        for(int i=0;i<arr.length-1;i++){
            if(min>arr[i]){
                min=arr[i];
                min_index=i;
            }

        }
        return min_index;

    }
    public static int RotationCount1(int arr2[]){
        int max=arr2[arr2.length-1];
        int max_index=arr2.length-1;
        for(int i=arr2.length-1;i>=0;i--){
            if(max<arr2[i]){
                max=arr2[i];
                max_index=i;
            }

        }
        return max_index;

    }
    public static void main(String args[]){
        int arr[]={12,15,18,3,4,5,6,8};
        int arr2[]={5,6,8,12,15,18,3,4};
        int rotate_count_left=RotationCount1(arr2);
        System.out.println(rotate_count_left);

        // int rotate_count_right=RotationCount(arr);
        // System.out.println(rotate_count_right);

    }
    
}
