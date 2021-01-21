package assignment2;
import java.util.*;

public class DumbQueue {
    public MyStack s;

    public DumbQueue(ArrayList<Integer>myStack){
        this.s = new MyStack(myStack);
    }

    public void dQueue(Integer k){ //This BiG O complexity does not seem as bad as it should be, with an ArrayList it can just .add to the end
        this.s.push(k);
    }

    public void deDQueue(){ //because I used a MyStack the item is an ArrayList which has a .remove funtion, if I was suppoased to do this with
        //a normal list I can redo it if needed.
        this.s.pop(0);
    }

    public void printDQ(){
        this.s.printStack();
    }
}
