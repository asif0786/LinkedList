public class LinkedList {
    Node head;
    Node tail;

    public LinkedList insert(LinkedList l1, int data) {
        Node newNode = new Node(data);
        if (l1.head == null) {
            l1.head = l1.tail = newNode;
            head.previous = null;
            head.next = null;
        } else {
            l1.tail.next = new Node(data);
            newNode.previous = l1.tail;
            l1.tail = newNode;
            l1.tail.next = null;
        }
        return l1;
}
public  void print(LinkedList l1){
    Node currentNode = l1.head;
    System.out.println("Linked List : ");
    while(currentNode != null){
        System.out.println(currentNode.data + " ");
        currentNode = currentNode.next;
    }
}
}
class Main{
    public static void main(String[] args){

        LinkedList l = new LinkedList();
        l = l.insert(l, 56);
        l = l.insert(l, 30);
        l = l.insert(l, 70);
        l = l.insert(l, 89);
        l = l.insert(l, 89);

    }
}