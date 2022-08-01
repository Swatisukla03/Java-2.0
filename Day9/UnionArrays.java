package Day9;

import java.util.Arrays;
import java.util.HashSet;

import Day2.size;

public class UnionArrays {
       public static void getUnion(int arr1[],int arr2[],int m,int n){
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<n;i++)
        h.add(arr1[i]);


    
        for(int i=0;i<m;i++)
        h.add(arr2[i]);


        System.out.println(h.toString());




       }

       public static void getIntersection(int arr1[],int arr2[],int m,int n){
                int i=0;
                int j=0;
                while(i<n && j<m){
                    if(arr1[i]>arr2[j]){
                        j++;
                    }

                    else if(arr2[j]>arr1[i]){
                        i++;
                    }


                    else{
                        System.out.println(arr1[i]+" ");
                        i++;
                        j++;
                    }
                }



       }





    public static void main(String args[]){
        int arr1[]={1,3,2,3,4,5,5,6};
        int arr2[]={3,3,5};
        int m=arr1.length;
        int n=arr2.length;
        // getUnion(arr1,arr2,m,n);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        getIntersection(arr1,arr2,m,n);
    //    System.out.println(getInter);


    }
    
}
