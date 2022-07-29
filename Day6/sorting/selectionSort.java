package Day6.sorting;

public class selectionSort {

    public static void SelectSort(int arr[]) {
        int n = arr.length;
  
         for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++)

                if(arr[j]<arr[min_index])
                    min_index=j;



                    int temp=arr[min_index];
                    arr[min_index]=arr[i];
                    arr[i]=temp;
                

            }
         



    }

    public static void print(int arr[]) {

        System.out.println("");
        for (int i = 0; i < arr.length;++i) {
            System.out.print(arr[i] + " ");
            // System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[] = {64,25,12,22,11};
        SelectSort(arr);
        print(arr);

    }

}
