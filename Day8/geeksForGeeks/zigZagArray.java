package Day8.geeksForGeeks;

import java.util.Arrays;

public class zigZagArray {

    // public static void zigzag(int arr[]){

    // for(int i=1;i<arr.length;i=i+2){

    // if(arr[i-1]>arr[i])
    // swapArray(arr,i,i-1);

    // if( i+1<arr.length && arr[i]<arr[i+1])
    // swapArray(arr,i,i+1);

    // // flag!=flag;
    // }

    // public static void zigZag(int arr[]) {
    // int flag = 1;
    // int temp = 0;
    // // loop iterate over the array
    // for (int i = 0; i <= arr.length - 2; i++) {
    // if (flag == 1) {
    // // execute if elements are in the order a > b > c
    // if (arr[i] > arr[i + 1]) {
    // // swapping logic
    // temp = arr[i];
    // arr[i] = arr[i + 1];
    // arr[i + 1] = temp;
    // }
    // } else {
    // // execute if elements are in the order a < b < c
    // if (arr[i] < arr[i + 1]) {
    // // swapping logic
    // temp = arr[i];
    // arr[i] = arr[i + 1];
    // arr[i + 1] = temp;
    // }
    // }
    // if (flag == 1)
    // flag = 0;
    // else
    // flag = 1;
    // }
    // }

    public static void zigzag2(int arr[]) {
        int temp = 0;

        int flag = 1;

        for (int i = 0; i <= arr.length - 2; i++) {

            if (flag == 1) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            } else {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
            if (flag == 1)
                flag = 0;
            else
                flag = 1;
        }

    }

    // public static void print(int arr[]){
    // for(int i=0;i<arr.length;i++){
    // System.out.print(arr[i]+" ");
    // }
    // }
    public static void main(String args[]) {
        int arr[] = { 2, 4, 5, 1, 7, 6, 8 };
        // System.out.println(Arrays.toString(arr));
        // zigZag(arr);
        // System.out.println(Arrays.toString(arr));

        // System.out.println();
        zigzag2(arr);
        System.out.println(Arrays.toString(arr));
        // swapArray(arr, a, b);
        // print(arr);

    }

}
