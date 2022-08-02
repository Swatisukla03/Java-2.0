package Day9.Revision;

import javax.naming.directory.SchemaViolationException;

public class isSubset {

    public static boolean isSubset(int arr1[],int arr2[],int n,int m){
        int i=0;
        int j=0;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){

                if(arr1[j]==arr2[i])
                break;

            }
            

                if(j==m)
                return false;
            


           
                // System.out.println("No");    

        }
        // System.out.println("Yes");
        return true;

    }
   public static void main(String args[]){
    int arr1[]={3,4,5,7,8};
    int arr2[]={3,4,5};
    int m=arr1.length;
    int n=arr2.length;
    if(isSubset(arr1, arr2,n,m))
    System.out.println("Yes");

    else
    System.out.println("No");


   }
    
}
