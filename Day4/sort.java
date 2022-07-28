package Day4;

import java.util.Arrays;

import javax.sql.rowset.spi.SyncResolver;

public class sort {
    public static void main(String args[]){
    int[] array=new int[]{90,34,56,78,12,34};
    Arrays.sort(array);
    System.out.println("Elements of array sorted in ascnding order :");
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+",");
    }



    }
    
    
}
