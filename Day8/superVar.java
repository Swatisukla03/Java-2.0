package Day8;


class parent{
    int a=10;

}

class derived extends parent{
    int a=80;

    void display(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);

    }

}

public class superVar {

    public static void main(String args[]){
    derived d1=new derived();
    d1.display(30);

    }
    
}
