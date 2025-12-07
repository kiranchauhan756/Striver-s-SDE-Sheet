package org.example.linked_list;

import static org.example.linked_list.Add_Element_in_Linked_List.head;

public class Insert_At_Start_Linked_List {
    public static Node slow;
    public static Node fast;

    public static void insertAtStartOfLinkedList() {
        Add_Element_in_Linked_List.createNewElementInLinkedList();
        Add_Element_in_Linked_List.printElementInLinkedList();
        Node newNode = new Node(11);
        newNode.next = head;
        head=newNode;
        Add_Element_in_Linked_List.printElementInLinkedList();
    }

    }
