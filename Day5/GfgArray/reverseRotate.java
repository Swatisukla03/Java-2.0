package Day5.GfgArray;

public class reverseRotate {
    public static void main(String args[]){
        int arr[]={1,2,5,6,7,8};
        int n=arr.length;
        int d=2;
        System.out.println("Befotre Reverse :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
        print(arr);


    }
    public static void print(int arr[]){
        System.out.println("After Reversing :");
        for(int i=0;i<arr.length;i++){
            
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[],int start,int end){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        // System.out.println();
        // System.out.println("After Reversing :");

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
    }
    
}
