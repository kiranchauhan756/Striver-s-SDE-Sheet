package org.example.linked_list;

import static org.example.linked_list.Add_Element_in_Linked_List.head;

public class Search_Element_In_Linked_List {

    public static void searchElementInLinkedList() {
        Node temp=head;
        int value=20;
        boolean present=false;
        Add_Element_in_Linked_List.createNewElementInLinkedList();
        Add_Element_in_Linked_List.printElementInLinkedList();
        while(temp!=null){
            if(temp.data==value){
                present=true;
                break;
            }
            temp=temp.next;
        }
        if(present) System.out.println("Element is present in Linked List");
        else System.out.println("Element is not present in Linked List");


    }
}
