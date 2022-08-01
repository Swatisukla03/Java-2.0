package Day8.geeksForGeeks.Revision;

public class subset {

    public static void checkSubset(int arr1[],int arr2[],int n,int m){
        int i,j;
        for( i=0;i<n;i++){
            for( j=0;j<m;j++)
              if(arr2[i]==arr1[j])
                break;

                if(j==m)
                System.out.println("No");    
           
             }
        System.out.println("yes");
        

    }
    public static void main(String args[]){
        int arr1[]={6,8,9,4,5,2,1,3};
        int arr2[]={7,1,3,4};
        int n=arr2.length;
        int m=arr1.length;
         checkSubset(arr1, arr2, n, m);
        //  System.out.println(check_no);
        

    }
    
}
