package assignment2;

public class MyList {
    public int [] currentList;

    public MyList (int [] inList){
        this.currentList = inList;
    }

    public void append(int k){ //the Big O complexity is the each individual item of the array to a new one, so currentList.length+1
        int [] sample = new int [this.currentList.length+1];
        for(int i =0; i< this.currentList.length; i++){
            sample[i] = this.currentList[i];
        }
        sample [this.currentList.length] = k;
        this.currentList = sample;
    }

    public void pop(){ // the Big O complexity of this method is one less than the length of currentList
        int [] sample = new int [this.currentList.length-1];
        for(int i =0; i< this.currentList.length-1; i++) {
            sample[i] = this.currentList[i];
        }
        this.currentList = sample;
    }

    public void insert(int num, int index){ //this, like append, has to do one more addition than the length of the List.
        int [] sample = new int [this.currentList.length+1];
        for(int i =0; i< index; i++) {
            sample[i] = this.currentList[i];
        }
        sample[index] = num;
        for(int j = index+1; j<this.currentList.length+1; j++){
            sample[j] = this.currentList[j-1];
        }
        this.currentList = sample;
    }

    public void remove(int index) { // This has one more calculation than the length making it more complex
        int[] sample = new int[this.currentList.length];
        for (int i = 0; i < index; i++) {
            sample[i] = this.currentList[i];
        }
        for (int j = index; j < this.currentList.length-1; j++) {
            sample[j] = this.currentList[j+1];
        }
        this.currentList = sample;
        int[] sample2 = new int[sample.length-1];
        for(int k=0; k<sample.length-1; k++){
            sample2[k] = sample[k];
        }
        this.currentList = sample2;
    }

    public void printList(){
        System.out.print("["+this.currentList[0]);
        for(int i =1; i< this.currentList.length; i++){
            System.out.print(", "+this.currentList[i]);
        }
        System.out.println("]");
    }
}
