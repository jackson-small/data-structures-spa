package assignment4;

public class MyLinkedList { //I read an article about linked lists, https://www.geeksforgeeks.org/linked-list-set-1-introduction/
    //I think I took the printList becuase it was just availible and I encountered it
    Node head;

    public MyLinkedList(Node h){
        this.head = h;
    }

    public void printList(MyLinkedList lst) {
        Node n = lst.head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void add(int k){
        Node n = new Node(k);
        n.next = this.head;
        this.head = n;
    }

    public void remove(int index){ //with Mr. Hinh in class
        Node current = this.head;
        Node previous = null;
        Node next = null;
        int i =0;
        while(current!= null){
            next = current.next;
            if(i == index){
                previous.next = next;
                break;
            }
            previous = current;
            current = next;
            i++;
        }

    }

    public void insert(int k, int index){
        Node inNode = new Node(k);
        Node current = this.head;
        Node previous = null;
        Node next = null;
        int i =0;
        while(current!= null){
            next = current.next;
            if(i == index){
                inNode.next = previous.next;
                previous.next = inNode;
            }
            previous = current;
            current = next;
            i++;
        }
    }

   public void switchNodes(int index1, int index2){
       Node temp1 = null;
       Node temp2 = null;
       Node current = this.head;
       Node previous = null;
       Node next = null;
       int i =0;
       while(current!= null){
           next = current.next;
           if(i == index1){
               temp1 = current;
           }
           else if(i ==  index2){
               temp2 = current;
           }
           previous = current;
           current = next;
           i++;
       }
       current = this.head;
       previous = null;
       next = null;
       i =0;
       while(current!= null){
           next = current.next;
           if(i == index1){
               remove(index1);
               insert(temp2.data, index1);
           }
           else if(i ==  index2){
               remove(index2);
               insert(temp1.data, index2);
           }
           previous = current;
           current = next;
           i++;
       }
   }

   public void reverse(){ // I watched the geeksforgeeks reversed linkedlist video: https://www.youtube.com/watch?v=D7y_hoT_YZI&feature=emb_title
       Node current = this.head;
       Node previous = null;
       Node next = null;
       while(current!= null){
           next = current.next;
           current.next = previous;
           previous = current;
           current = next;
       }
       this.head = previous;
   }

}
