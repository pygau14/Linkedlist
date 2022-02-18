public class Singlelinked {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data =d;
            next = null;
        }
    }
    public void append(int newNodedata) {
        Node newNode = new Node(newNodedata);
        Node temp = head;
        while(temp != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void reverse(){
        Node current = head;
        Node next = null;
        Node prev = null;
        while(current.next != null){
            
        }
    }
}
