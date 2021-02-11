package part1;

public class assignment5Main {
    public static void main(String[] args){
        MyHashSet myHash = new MyHashSet();
        myHash.add(4);
        myHash.add(16);
        myHash.add(13);
        System.out.println(myHash.isInSet(4));
        myHash.add(4);
    }
}
