package Day10;

import Day4.reverse;

public class FirstOccur {
    public static int getFirst(int arr[],int index,int val){
        if(index==arr.length)
        return -1;
        if(arr[index]==val)
        return index;
        else{
            int first_index=getFirst(arr, index+1, val);
            return first_index;
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,6,9,8,3,2,6,2,4};
        int first_occur=getFirst(arr, 0, 6);
        System.out.println(first_occur);


    }
    
}
