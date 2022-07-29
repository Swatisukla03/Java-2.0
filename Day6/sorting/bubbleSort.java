package Day6.sorting;

public class bubbleSort {
    public static void main(String args[]) {
        int arr[] = { 4, 2, 6, 8, 1, 5 };
        sortArray(arr);
        printArray(arr);

    }
    public  static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }

    public static void sortArray(int arr[]) {
        int n = arr.length;
        
        System.out.println("Before sorting :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();





        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

}
