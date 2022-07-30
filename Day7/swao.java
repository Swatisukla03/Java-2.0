package Day7;

public class swao {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int arr2[]={5,4,3,2,1};
        // System.out.println(arr[0]+" "+arr2[0]);
        // swap(arr, arr2);
        // System.out.println(arr[0]+ " "+arr2[0]);
                // System.out.println(arr[0]+" "+arr[1]);
        swap1(arr[0], arr[1]);
        // System.out.println(arr[0]+" "+arr[1]);

    }
    public static void swap1(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void swap(int arr[],int arr2[]){
        int temp=arr[0];
         arr[0]=arr2[0];
         arr2[0]=temp;
    }
    
}
