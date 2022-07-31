package Day8;


class employee{
    int emp_id;
    String emp_name;
    void insertdata(int id,String n){
        emp_id=id;
        emp_name=n;
    }
    void displayData(){
        System.out.println(emp_id +" "+emp_name);
    }

}

public class objectWithFunc {
    public static void main(String args[]){
        employee e1=new employee();
        employee e2=new employee();
        e1.insertdata(111, "Krishan");
        e2.insertdata(112, "Deepak");


        e1.displayData();
        e2.displayData();


    }
    
}
