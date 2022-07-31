package Day8.geeksForGeeks;

public class CheckSubsert {

    public static String checkSubset(int arr[],int arr1[],int m,int n){
          int  i=0;
          int j=0;
        for( i=0;i<n;i++){
            for( j=0;j<m;j++){
                if(arr[j]==arr1[j])
                break;


                if(j==m)
                return "No";
            }
            
        }
        return "Yes";

    }
    public static void main(String args[]){
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };
 
        int m = arr1.length;
        int n = arr2.length;
         String check= checkSubset(arr1, arr2, m, n);
         System.out.println(check);
      


    }

    
}
