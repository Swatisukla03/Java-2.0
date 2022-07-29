package Day5.Revision;

public class ReverseRotate {
    public static void reverseRotate(int arr[],int start,int end){
        int temp;

        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        // System.out.println("After Rotation :");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        }

    

    public static void print(int arr[]){
        System.out.println();
        System.out.println("After Reverse Rotation :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,9,11,34,56};
        int n=arr.length;
        int d=2;
        System.out.println("Before Rverse Rotation :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        reverseRotate(arr, 0, d-1);
        reverseRotate(arr, d, n-1);
        reverseRotate(arr, 0, n-1);
        print(arr);

    }
    
}
