package Day5;

import java.util.ArrayList;
import java.util.List;

public class arraylistpro {
    public static void main(String args){
        List<String>StudentName=new ArrayList<>();
        StudentName.add("Swati");
        StudentName.add("Richa");
        StudentName.add("Prachi");

        List<String>StdentRollNo=new ArrayList<>();
        StdentRollNo.add("Muskan");
        StdentRollNo.add("Simran");


        StudentName.addAll(StdentRollNo);
        System.out.println(StudentName);
    }
    
}
