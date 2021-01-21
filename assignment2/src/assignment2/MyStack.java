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
    public void pop(){
        this.myStack.remove(this.myStack.get(this.myStack.size()-1));
    }

    public int stackLength(){
        int length =0;
        for(int i=0; i<this.myStack.size(); i++){
            length++;
        }
        return length;
    }

    public int getItem(int index){
        int r =0;
        r = this.myStack.get(index);
        return r;
    }

    public void printStack(){
        System.out.println(this.myStack.toString());
    }
}
