package org.example.linked_list;

import java.util.Scanner;

import static org.example.linked_list.Add_Element_in_Linked_List.head;

public class Delete_Element_in_Linked_List {

    public static void deleteElementInLinkedList() {
        Add_Element_in_Linked_List.createNewElementInLinkedList();
        Add_Element_in_Linked_List.printElementInLinkedList();

        System.out.println("Enter the element which you wan to delete from Linked List");
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        Node temp=head;
        boolean find=false;
        while(temp!=null){
            if(temp.data==element){
                temp.data=temp.next.data;
                temp.next=temp.next.next;
                find=true;
                break;
            }
            temp=temp.next;

        }
        if(find) System.out.println("Element is successfully delete from Linked List");
        else System.out.println("Element was not present in the Linked List");
        Add_Element_in_Linked_List.printElementInLinkedList();
    }
}
