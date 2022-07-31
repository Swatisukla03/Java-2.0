package Day8;
class Animal{
    String name;
    public void eat(){
        System.out.println("I can eat");
    }

}

class dog extends Animal{
    public void display(){
        System.out.println("My name is "+name);
    }

}



 
   

 

public class singleInheritance {
    public static void main(String[] args){
        dog labrador=new dog();
        labrador.name="Rohu";
        labrador.display();
        labrador.eat();

         

    }
}
    

