package Day7;

import java.util.Arrays;

public class ArrayOp {
    public static void main(String args[]){
        int arr[]={3,4,2,1,5,9,0,6};
         int max_value=maxA(arr);
         System.out.println(max_value);
         search(arr, 5);
        reverse(arr);
         
       
        System.out.println(Arrays.toString(arr));

    }
    public static int maxA(int arr[]){
        int max_value=arr[0];
        
        for(int i=0;i<arr.length;i++){
             
            
            if(arr[i]>max_value){
                max_value=arr[i];
            }
            
           
        }
        return max_value;
        

    }
    public static void reverse(int arr[]){
       int  si=0;
       int  end=arr.length-1;
        while(si<end){
            int temp=arr[si];
            arr[si]=arr[end];
            arr[end]=temp;
            si++;
            end--;
            

        }
   
        }

    
    public static void search(int arr[],int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                System.out.println(i);
            }
        }

    }
    
}
