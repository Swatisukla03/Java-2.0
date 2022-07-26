package Day2;

public class NonPrimitive {
    public static void main(String args[]){
        String str="Test";
        System.out.println(str);
        String str1=new String("test");
        System.out.println(str1);


        String arr[];
        arr=new String[2];
        arr[0]="Swati";
        arr[1]="Richa";


        for(int i=0;i<arr.length;i++){
            System.out.println("Inside the loop");
            System.out.println(arr[i]);
        }
        // arr[2]=2;
        System.out.println(arr);
        System.out.println(arr[0]);
    
    }
    
}
