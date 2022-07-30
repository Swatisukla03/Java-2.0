package Day7.Geekfgeeks;

public class RotateArray {
    public static void rotateArray(int arr[],int d,int n){
        for(int i=0;i<d;i++){
            int last=arr[0];
            for(int j=0;j<n-1;j++){
                
                arr[j]=arr[j+1];
            }
                arr[n-1]=last;

            
        }
        for(int i=0;i<n;i++){
                    System.out.println(arr[i]);
        }

    }
    // public static void printArray(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.println(arr[i]);
    //     }
    // }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int d=2;
        int n=arr.length;
        rotateArray(arr, d,n);
        // printArray(arr);

    }
    
}
