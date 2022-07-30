package Day7.Geekfgeeks;

public class MinJump {

    public  static boolean canJump(int arr[]){
        int n=arr.length;
        int reachable=0;
        for(int i=0;i<n;i++){
            if(reachable<i)
                return false;

                reachable= Math.max(reachable,i+arr[i]);

            
        }
        return true;
    }
    public static void main(String args[]){
        int arr[]={1,1,2,5,2,1,0,0,1,3};
        boolean can_jump=canJump(arr);
        System.out.println(can_jump);


    }
    
}
