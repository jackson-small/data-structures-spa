package assignment4;

public class Assignment4Main {
    public static void main(String[] args) {
        Node n = new Node(5);
        MyLinkedList myList = new MyLinkedList(n);
        System.out.println("MyList:");
        myList.printList(myList);
        System.out.println();

        myList.add(4);
        myList.add(9);
        myList.add(2);
        myList.add(7);
        System.out.println(".add() test");
        myList.printList(myList);
        System.out.println();

        myList.remove(2);
        System.out.println(".remove() test");
        myList.printList(myList);

        myList.insert(17, 2);
        System.out.println();
        System.out.println(".insert() test");
        myList.printList(myList);

        myList.switchNodes(1, 3);
        System.out.println();
        System.out.println(".switchNodes() test");
        myList.printList(myList);

        myList.reverse();
        System.out.println();
        System.out.println(".reverse() test");
        myList.printList(myList);
        System.out.println();


        Node k = new Node(8);
        MyLinkedList myList2 = new MyLinkedList(k);
        myList2.add(4);
        myList2.add(12);
        myList2.add(2);
        System.out.println();
        System.out.println("myList2:");
        myList2.printList(myList2);
        System.out.println();
        MyLinkedList temp = new MyLinkedList(k);
        temp = merge(myList, myList2);
        System.out.println("merge() test");
        temp.printList(temp);
    }

    public static MyLinkedList merge(MyLinkedList lst1, MyLinkedList lst2){
        lst1.reverse();
        Node current = lst1.head;
        Node previous = null;
        Node next = null;
        while(current!=null){
            next = current.next;
            lst2.add(current.data);
            previous = current;
            current = next;
        }
        return lst2;
    }
}
