package Day8;
class student{
    int id;
    String name;

}

public class object {
 
    public static void main(String args[]){
         student s1=new student();
         s1.id=11;
         s1.name="Swati";
         student s2=new student();
         s2.id=12;
         s2.name="Richa";

        System.out.println(s1.id);
        System.out.println(s1.name);

        System.out.println(s2.id);
        System.out.println(s2.name);

        

    }
    
}
