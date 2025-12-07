package org.example.linked_list;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Add_Element_in_Linked_List {
     Node head;
     Node current;
    public void createNewElementInLinkedList() throws InputMismatchException {
        // Enter ele in Linked List
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number to be added in LinkedList (Press -1 to exit)");
            try {
                int element = sc.nextInt();
                    if(element==-1)break;

                    if (head == null) {
                        head = new Node(element);
                        current = head;
                    } else {
                        current.next = new Node(element);
                        current = current.next;
                    }
            }
            catch (InputMismatchException e){
                System.out.println("Enter only integer value");
                sc.nextLine();
            }
    }
    }
    public void printElementInLinkedList(Add_Element_in_Linked_List list){
     Node temp=list.head;
     while(temp!=null){
         System.out.println(temp.data);
         temp=temp.next;
     }
    }

}
