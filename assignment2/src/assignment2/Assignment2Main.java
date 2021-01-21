package assignment2;
import java.util.*;

public class Assignment2Main {
    public static void main(String[] args) {
        int [] inList = {1 ,3 ,5 ,9};
        MyList currentL = new MyList(inList);
        System.out.println("MyList Methods:");
        currentL.printList();
        currentL.append(4);
        currentL.printList();
        currentL.pop();
        currentL.printList();
        currentL.insert(4,2);
        currentL.printList();
        currentL.remove(1);
        currentL.printList();
        System.out.println();

        ArrayList<Integer> aList = new ArrayList<Integer> (Arrays.asList(1,3,5,9));
        MyStack myStack = new MyStack(aList);
        System.out.println("MyStack Methods:");
        myStack.printStack();
        myStack.pop(0);
        myStack.printStack();
        myStack.push(3);
        myStack.printStack();
        System.out.println();


        int [] que = {2,4,6,10};
        MyQueue currentQ = new MyQueue(que);
        System.out.println("MyQueue Methods:");
        currentQ.printQueue();
        currentQ.queue(21);
        currentQ.printQueue();
        currentQ.dequeue();
        currentQ.printQueue();
        System.out.println();

        ArrayList<Integer> bList = new ArrayList<Integer> (Arrays.asList(5,12,13,23));
        DumbQueue dQ = new DumbQueue(bList);
        System.out.println("DumbQueue Methods:");
        dQ.printDQ();
        dQ.dQueue(2);
        dQ.printDQ();
        dQ.deDQueue();
        dQ.printDQ();
    }
}
