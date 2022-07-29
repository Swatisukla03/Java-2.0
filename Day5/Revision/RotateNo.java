package Day5.Revision;
//Rotate left;

public class RotateNo {
    public static void RotateLeft(int arr[],int n,int no){
        System.out.println("Before rotation :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<no;i++){
            int first=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }




            arr[arr.length-1]=first;
        }
        System.out.println();


        System.out.println("After Rotation :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }



    }
    public static void main(String args[]){
        int arr[]={3,4,6,7,8,19};
        int n=arr.length;
        int d=2;
        RotateLeft(arr, n, d);
        

    }
    
}
