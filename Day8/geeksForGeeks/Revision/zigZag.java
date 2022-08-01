package Day8.geeksForGeeks.Revision;

import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

public class zigZag {
    public static void swapno(int arr[],int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void zigzag(int arr[]){
        int flag=1;

        for(int i=0;i<arr.length-1;i++){
            if(flag==1){
                if(arr[i]>arr[i+1])
                swapno(arr, i, i+1);
                

            }
            else{
                if(arr[i]<arr[i+1])
                swapno(arr, i, i+1);

            }

            if(flag==1)
            flag=0;
            else
            flag=1;
          

        }
      

    }
    public static void main (String args[]){
        int arr[]={4,3,7,8,6,2,1};
        zigzag(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}
