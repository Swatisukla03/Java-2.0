package Day7.Revision;

public class InsertionSort {
     
    public static void sortArray(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr_ele=arr[i];
            int j=i-1;
                while(j>=0 &&  curr_ele<arr[j] ){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=curr_ele;
            }

        }

        public static void PrintArray(int arr[]){


            for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            }
        }



        // public static void sortArray(int arr[]) {
        //     for (int i = 1; i < arr.length; i++) {
        //         int current = arr[i];
        //         int j = i - 1;
        //         while (j >= 0 && current < arr[j]) {
        //             arr[j + 1] = arr[j];
        //             j--;
        //         }
        //         arr[j + 1] = current;
        //     }
    
        // }
        public static void main(String args[]){
            int arr[]={3,5,1,2,8};
            sortArray(arr);
            PrintArray(arr);
    
        }

    }
    

