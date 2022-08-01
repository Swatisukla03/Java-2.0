package Day9;

public class Inverse {
    public static void main(String[] args){


           int[] arr={1,0,2,3};
           boolean f=true;
           for(int i=0;i<arr.length;i++){
            if(arr[arr[i]] !=i){
                f=false;
                break;
            }
           }
           System.out.println(f);

    }
    
}
