package part2;
import java.util.*;

public class TimesTableMain {
    public static void main(String[] args){
        double startTime = System.nanoTime();
        randAList(100000000,15);
        double endTime = System.nanoTime();
        double duration = (endTime/1000000 - startTime/1000000);
        System.out.println("done!" +duration);

    }
    public static void randHash(int k, int c){
        HashSet<Integer> hSet = new HashSet<Integer>();
        Random rand = new Random();
        int r;
        for(int i = 0; i<k; i++){
            r = rand.nextInt(100000)+1;
            hSet.add(k);
        }
        hSet.contains(c);
    }

    public static void randTree(int k, int c){
        TreeSet<Integer> tSet = new TreeSet<Integer>();
        Random rand = new Random();
        int r;
        for(int i = 0; i<k; i++){
            r = rand.nextInt(100000)+1;
            tSet.add(k);
        }
        tSet.contains(c);
    }

    public static void randLList(int k, int c){
        LinkedList<Integer> llist = new LinkedList<Integer>();
        Random rand = new Random();
        int r;
        for(int i = 0; i<k; i++){
            r = rand.nextInt(100000)+1;
            llist.add(k);
        }
        llist.contains(c);
    }

    public static void randAList(int k, int c){
        ArrayList<Integer> aList = new ArrayList<Integer>();
        Random rand = new Random();
        int r;
        for(int i = 0; i<k; i++){
            r = rand.nextInt(100000)+1;
            aList.add(k);
        }
        aList.contains(c);
    }
}
