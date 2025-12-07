package org.example.linked_list;

public class ReverseLinkedList {
    Node head;
    Node current;
    public  void createLinkedList(){

        //First Element
        head=new Node(10);
        current=head;

        //Second Element
        current.next=new Node(35);
        current=current.next;

        //Third Element
        current.next=new Node(89);
        current=current.next;

        //Fourth Element
        current.next=new Node(44);
        current=current.next;
    }

    public void printLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void printReverseList(){
       Node prev=null;
       Node current=head;
       Node next;
       while(current!=null){
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;

       }
       head=prev;
    }

}
