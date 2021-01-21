package assignment2;
import java.util.*;

public class MyQueue {
    public ArrayList<Integer> arrayStack;

    public MyQueue(ArrayList<Integer> inArray){
        this.arrayStack = inArray;
    }

    public void queue(int q){
        this.arrayStack.add(q); //O(1)
        /*int [] sample = new int [this.arrayStack.length+1];
        for(int i =0; i< this.arrayStack.length; i++){
            sample[i] = this.arrayStack[i];
        }
        sample [this.arrayStack.length] = q;
        this.arrayStack = sample;*/
    }

    public void dequeue(){ //O(1)
        this.arrayStack.remove(this.arrayStack.get(0));
        /*
        int[] sample = new int[this.arrayStack.length];
        for (int j = 0; j < this.arrayStack.length-1; j++) {
            sample[j] = this.arrayStack[j+1];
        }
        this.arrayStack = sample;
        int[] sample2 = new int[sample.length-1];
        for(int k=0; k<sample.length-1; k++){
            sample2[k] = sample[k];
        }
        this.arrayStack = sample2;*/
    }
    public void printQueue(){
        System.out.println(this.arrayStack.toString());
    }
}
