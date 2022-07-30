package Day6.revision;

public class selectionSOrt {
    public static void sortArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++){

                if (arr[j] < arr[min_index]) 
                    min_index = j;
            }
            

                    int temp;

                    temp = arr[min_index];
                    arr[min_index] = arr[i];
                    arr[i] = temp;
                }
            
            

        

    }


    // public static void SelectSort(int arr[]) {
    //     int n = arr.length;
  
    //      for(int i=0;i<n-1;i++){
    //         int min_index=i;
    //         for(int j=i+1;j<n;j++)

    //             if(arr[j]<arr[min_index])
    //                 min_index=j;



    //                 int temp=arr[min_index];
    //                 arr[min_index]=arr[i];
    //                 arr[i]=temp;
                

    //         }
         



    // }


    public static void printArray(int arr[]) {
        System.out.println("After sorting: ");
        // System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }

    public static void main(String args[]) {
        int arr[] = { 4, 6, 1, 23, 2, 5 };
        sortArray(arr);
        printArray(arr);

    }

}
