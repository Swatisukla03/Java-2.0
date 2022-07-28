package Day5.GfgArray;

public class RotateRight {
    public static void RotateRight(int arr[],int d){


        for(int i=0;i<d;i++){
            int last=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
             arr[0]=last;
        }


        System.out.println("After Right Swap :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int d=1;
        RotateRight(arr, d);

    }
    
}
