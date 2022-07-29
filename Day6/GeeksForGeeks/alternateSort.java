package Day6.GeeksForGeeks;

public class alternateSort {

    public static void altSort(Long arr[],int n){
        int min_index=0;
        int max_index=n-1;
        long  max=arr[n-1]+1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=arr[i]+(arr[max_index]%max)*max;
                max_index--;

            }
            else{
                arr[i]=arr[i]+(arr[min_index]%max)*max;
                min_index++;

            }
        }
        for(int i=0;i<n;i++){
            arr[i]/=max;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        

    }
    public static void main(String args[]){
        long arr[]={1,8,4,6,7,10};
        int n=arr.length;
        // altSort(arr, n);

    }
    
}
