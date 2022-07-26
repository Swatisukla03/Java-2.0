package Day2;

public class SwappingWithoutTemp {
    public static void main(String args[]){
        float first=12.5f,second=24.6f;
        System.out.println("Before Swap");
        System.out.println("First Number :"+first);
        System.out.println("Second number :"+second);

        first=first-second;
        second=first+second;
        first=second-first;


        System.out.println("After swapping ");
        System.out.println(first);
        System.out.println(second);
    }
    
}
