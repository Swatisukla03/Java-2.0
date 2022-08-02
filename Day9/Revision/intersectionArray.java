package Day9.Revision;

import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

public class intersectionArray {
    public static void intersect(int arr[], int arr1[], int n, int m) {
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if(arr[i]<arr1[j])
            i++;

            else if(arr[i]>arr1[j])
                   j++;


            else{
                System.out.println(arr[i]+" ");
                i++;
                j++;
            }

            
        }

    }

    public static void main(String args[]) {
        int arr[] = { 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr1[] = { 4, 5, 6, 7 };
        int n = arr.length;
        int m = arr1.length;
        Arrays.sort(arr);
        Arrays.sort(arr1);
        intersect(arr, arr1, n, m);
        // System.out.println(Arrays.toString(arr));

    }

}
