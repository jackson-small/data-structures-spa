package assignment1;
import java.util.*;

public class Mouse {
		private String name;
		private int xCoord;
		private int yCoord; 
		private ArrayList<ArrayList<Integer>> cordHistory = new ArrayList<ArrayList<Integer>>();
	
	
	public Mouse() {
		name = "Chucky";
		xCoord = 0;
		yCoord = 0;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(0);
		cord.add(0);
		cordHistory.add(cord);
	}
	public Mouse(String inName, int inXCoord, int inYCoord) {
		name = inName;
		xCoord = inXCoord;
		yCoord = inYCoord;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(inYCoord);
		cord.add(inYCoord);
		cordHistory.add(cord);
	}
	
	public String getMouseName() {

		return name;
	}
	public int getXCoordinate() {

		return xCoord;
	}
	public int getYCoordinate() {
		return yCoord;
	}

	
	public void printInformation() {
		String r = ("Name: "+getMouseName()+", Location: ("+getXCoordinate()+", "+getYCoordinate()+")"
				+ " History Stack: "+cordHistory.toString());
		System.out.println(r);
	}
	
	public void moveUp() {
		this.yCoord = this.yCoord+1;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(this.xCoord);
		cord.add(this.yCoord);
		this.cordHistory.add(cord);
	}
	public void moveDown() {
		this.yCoord = this.yCoord-1;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(this.xCoord);
		cord.add(this.yCoord);
		cordHistory.add(cord);
	}
	
	public void moveRight() {
		this.xCoord = this.xCoord+1;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(this.xCoord);
		cord.add(this.yCoord);
		cordHistory.add(cord);
	}
	public void moveLeft() {
		this.xCoord = this.xCoord-1;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(this.xCoord);
		cord.add(this.yCoord);
		cordHistory.add(cord);
	}
	
}

