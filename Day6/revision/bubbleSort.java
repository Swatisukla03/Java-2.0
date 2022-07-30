package Day6.revision;

public class bubbleSort {
    public static void main(String args[]){
        int arr[]={3,1,0,23,11,13,56,45};
        sortArray(arr);
        printArray(arr);

    }
    public static void sortArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }

    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
