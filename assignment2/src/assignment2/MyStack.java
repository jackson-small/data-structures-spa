package assignment2;
import java.util.*;

public class MyStack {
    public ArrayList<Integer> myStack;

    public MyStack(ArrayList<Integer> myStack) {
        this.myStack = myStack;
    }

    //Add to the end of the stack o(1)
    public void push(Integer k) {
        this.myStack.add(k);
    }

    //Take "first" (last element in list) element out and return it
    public void pop(Integer index){
        this.myStack.remove(this.myStack.get(index));
    }

    public void printStack(){
        System.out.println(this.myStack.toString());
    }
}
