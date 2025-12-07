package org.example.linked_list;

import static org.example.linked_list.Add_Element_in_Linked_List.head;

public class Find_Middle_Of_Linked_List {
    public static Node slow;
    public static Node fast;

    public static void findMiddleOfLinkedList(){
    Add_Element_in_Linked_List.createNewElementInLinkedList();
    Add_Element_in_Linked_List.printElementInLinkedList();

    slow=fast=head;
    while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
        System.out.println("Middle of Linked List is : "+slow.data);
    }
}
