package Day8.geeksForGeeks.Revision;

public class missinNum {
    public static void missingNum(int arr[],int n){
        int missing_no;
        int total_sum=((n+1)*(n+2))/2;
        int sum=0;
        

        for(int i=0;i<n;i++){
            sum=sum+arr[i];
         

        }
        if(sum==total_sum)
        System.out.println("no missing");

        else{
         missing_no=total_sum-sum;
         System.out.print(missing_no);



               
        }
        
       
        
                
            
           


    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4,5,6,7,8};
        int n = arr.length-1;
        missingNum(arr, n);
        // System.out.println(Missing_no);

    }

}
