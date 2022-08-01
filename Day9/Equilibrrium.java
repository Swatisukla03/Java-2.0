package Day9;

public class Equilibrrium {

    public static int equlibriumPoint(int arr[],int n){

       int i,j;
       int leftsum,rightsum;


       for(i=0;i<n;i++){
        leftsum=0;

        for(j=0;j<i;j++)
        leftsum=leftsum+arr[j];

        rightsum=0;   
        for(j=i+1;j<n;j++)
        rightsum=rightsum+arr[j];

        if(leftsum==rightsum)
        return i;

       }
       return -1;

    }

    public static void main(String args[]){
        int arr[]={1,3,5,2,2};
        int n=arr.length;
        int getIndex=equlibriumPoint(arr, n);
        System.out.println(getIndex);



    }

    
}
