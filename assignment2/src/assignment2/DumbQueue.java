package assignment2;
import java.util.*;

public class DumbQueue {
    public MyStack s;

    public DumbQueue(MyStack inS){
        this.s = inS;
    }

    public void dQueue(Integer k){ // 0(stackLength)
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i =0; i< this.s.stackLength(); i++){
            temp.add(s.getItem(i));
        }
        temp.add(k);
        this.s = new MyStack(temp);
    }

    public void deDQueue(){ //O(stacklength-1)
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i =1; i< this.s.stackLength(); i++) {
            temp.add(s.getItem(i));
        }
        this.s = new MyStack(temp);
    }

    public void printDQ(){
        this.s.printStack();
    }
}
