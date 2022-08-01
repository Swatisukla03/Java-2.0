package Day9;

import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

public class InterSection {
    public static void getintersection(int arr1[],int arr2[],int n,int m){
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j])
            i++;

            else if(arr1[i]>arr2[j])
                   j++;


            else{
                System.out.println(arr1[i]+" ");
                i++;
                j++;

            }
        }

    }


    public static void main(String args[]){
        int arr1[] = { 1, 3, 2, 3, 4, 5, 5, 6 };
        int arr2[] = { 3, 3, 5 };
 
        int n = arr1.length;
        int m = arr2.length;
       
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       
        // Function call
        getintersection(arr1, arr2, n, m);

    }
    
}
