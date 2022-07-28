package Day5;

import java.util.Stack;

public class stackpro {

    public static void main(String args[]){
        Stack<String>studentName=new Stack<>();
        studentName.push("Swati");
        studentName.push("Aarvi");
        studentName.push("Richa");
        studentName.push("Deepak");
        System.out.println(studentName);
        System.out.println(studentName.peek());
        studentName.pop();
        System.out.println(studentName.peek());
        System.out.print(studentName.clear());
    }
    
}
