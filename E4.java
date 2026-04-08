class Employee{
    void work(){
        System.out.println("Employee is working");
    }
    void salary(){
        System.out.println("Employee salary is 50000");
    }
}
class Manager extends Employee
{

    void work(int hours)
    {
        System.out.println("worked for " + hours + " hours");
    }
    void salary(){
        System.out.println("Manager salary is 80000");
    }
}
public class E4{
    public static void main(String[] args){
        Employee e = new Manager();
        e.work();
        e.salary();
        Manager m = new Manager();
        m.work(8);
    }
}