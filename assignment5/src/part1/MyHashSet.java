package part1;
import java.util.*;

public class MyHashSet {
    ArrayList<LinkedList<Integer>> myHashSet;
    int bucketSize = 15;

    public MyHashSet(){
        this.myHashSet = new ArrayList<LinkedList<Integer>>();
    }

    public void add(int k){
        if(this.myHashSet.size()==0) {
            this.myHashSet.add(new LinkedList<Integer>());
        }
        if(this.isInSet(k)){
            System.err.println(k + " is already in the HashSet");
        } else {
            double temp = k/this.bucketSize;
            int bucketLocation = (int) Math.floor(temp);
            if(bucketLocation < this.myHashSet.size()){
                this.myHashSet.get(bucketLocation).add(k);
            } else {
                while(bucketLocation >= this.myHashSet.size()){
                    this.myHashSet.add(new LinkedList<Integer>());
                }
                this.myHashSet.get(bucketLocation).add(k);
            }
        }
    }

    public boolean isInSet(int k){
        int j =0;
        for(int i =0; i<this.myHashSet.size(); i++){
            if(this.myHashSet.get(i).contains(k)){
                j = 1;
            }
        }
        if(j == 1){
            return true;
        } else{
            return false;
        }
    }

    private void hash(){

    }

}
