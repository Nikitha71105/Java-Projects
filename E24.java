interface sample{
    void display();
}
public class E24{
    public static void main(String[] args){
        sample s = new sample(){
            public void display(){
                System.out.println("Hi");
            }
        };
        s.display();
    }
}