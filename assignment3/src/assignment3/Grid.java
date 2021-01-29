package assignment3;
import java.util.*;

public class Grid {
    ArrayList<ArrayList<Integer>> myGrid;
    int xDimension;
    int yDimension;
    int numWalls;
    Mouse3 m;

    public Grid(int xDimension, int yDimension, int numberOfWalls, Mouse3 inM) {
        this.xDimension = xDimension;
        this.yDimension = yDimension;
        this.numWalls = numberOfWalls;
        this.myGrid = createGrid();
        this.m = inM;
    }

    private ArrayList<ArrayList<Integer>> createGrid(){
        ArrayList<ArrayList<Integer>> n = new ArrayList<>();
        for(int j=0; j<this.yDimension; j++) {
            ArrayList<Integer> zeros = new ArrayList<>(Collections.nCopies(this.xDimension, 0));

        Random rand = new Random();

        int change = rand.nextInt(zeros.size());
        zeros.set(change, 1);

        n.add(zeros);
        }
		return n;

    }

    public void changeSpot(int s){
        ArrayList<Integer> temp = this.myGrid.get(m.xCoord);
        temp.set(m.yCoord, s);
        this.myGrid.set(m.xCoord, temp);
    }
    public int getSpot(int x, int y){
        ArrayList<Integer> temp = this.myGrid.get(x);
        int num = temp.get(y);
        return num;
    }

    public void printGrid(){
        for(int i =0; i<this.myGrid.size(); i++) {
            System.out.println(this.myGrid.get(i).toString());
        }
    }
}
