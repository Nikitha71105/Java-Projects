class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class Linkedlist{
    Node head,tail;
    public void insert(int data){
        Node n = new Node(data);
        n.next = null;
        if(head == null){
            head = n;
            tail = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    public void inserBegin(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
    }
    public void insertAt(int pos,int data){
        Node n = new Node(data);
        Node temp = head;
        for(int i =0;i<pos-1;i++){
            temp = temp.next;
        }
        {
            n.next = temp.next;
            temp.next = n;
        }
    }
    public void deleteBeg(){
        Node temp = head;
        head = head.next;
        temp.next = null;
    }
    public void deleteEnd(){
        Node temp = head;
        while(temp.next!= tail){
            temp = temp.next;
        }
    }
}
public class Example {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.display();
    }
}