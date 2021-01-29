package assignment3;

import java.util.ArrayList;

public class Mouse3 {
		public String name;
		public int xCoord;
		public int yCoord;
		ArrayList<ArrayList<Integer>> cordHistory = new ArrayList<ArrayList<Integer>>();


	public Mouse3() {
		name = "Chucky";
		xCoord = 0;
		yCoord = 0;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(0);
		cord.add(0);
		cordHistory.add(cord);
	}
	public Mouse3(String inName, int inXCoord, int inYCoord) {
		name = inName;
		xCoord = inXCoord;
		yCoord = inYCoord;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(inYCoord);
		cord.add(inYCoord);
		cordHistory.add(cord);
	}

	public int [] scan(Grid g){
		int [] valDirection = new int[2];
		for(int i=1; i<11; i++){
				int val;
				if(i == 1 && this.xCoord+1<g.yDimension){ //down
					val = g.getSpot(this.xCoord+1, this.yCoord);
					if(val == 0) {
						valDirection[0] = val;
					} else {
						continue;
					}
					valDirection[1] = i;
					return valDirection;
				}
				else if(i == 2 && this.xCoord+1<g.yDimension && this.yCoord+1<g.xDimension){ //down-right
					val = g.getSpot(this.xCoord+1, this.yCoord+1);
					if(val == 0) {
						valDirection[0] = val;
					} else {
						continue;
					}
					valDirection[1] = i;
					return valDirection;
				}
				else if(i == 3 && this.yCoord+1<g.xDimension){ //right
					val = g.getSpot(this.xCoord, this.yCoord+1);
					if(val == 0) {
						valDirection[0] = val;
					} else {
						continue;
					}
					valDirection[1] = i;
					return valDirection;
				}
				else if(i == 4 && this.xCoord>0 && this.yCoord+1<g.xDimension){ //up-right
					val = g.getSpot(this.xCoord-1, this.yCoord+1);
					if(val == 0) {
						valDirection[0] = val;
					} else {
						continue;
					}
					valDirection[1] = i;
					return valDirection;
				}else if(i == 5 && this.xCoord>0){//up
					val = g.getSpot(this.xCoord-1, this.yCoord);
					if(val == 0) {
						valDirection[0] = val;
					} else {
						continue;
					}
					valDirection[1] = i;
					return valDirection;
				}else if(i == 6 && this.xCoord>0 && this.yCoord>0){//up-left
					val = g.getSpot(this.xCoord-1, this.yCoord-1);
					if(val == 0) {
						valDirection[0] = val;
					} else {
						continue;
					}
					valDirection[1] = i;
					return valDirection;
				}else if(i == 7 && this.yCoord>0){//left
					val = g.getSpot(this.xCoord, this.yCoord-1);
					if(val == 0) {
						valDirection[0] = val;
					} else {
						continue;
					}
					valDirection[1] = i;
					return valDirection;
				}else if(i == 8&& this.xCoord+1<g.yDimension && this.yCoord>0){//down-left
					val = g.getSpot(this.xCoord+1, this.yCoord-1);
					if(val == 0) {
						valDirection[0] = val;
					} else {
						continue;
					}
					valDirection[1] = i;
					return valDirection;
				} else if(i ==9 && this.cordHistory.size()>=2){
					valDirection[1] = i;
					return valDirection;
				} else if(i==10){
					valDirection[1] = i;
					return valDirection;
				}
		}
		return valDirection;
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

	public void moveBack(){
		this.cordHistory.remove(this.cordHistory.size() - 1);
		this.xCoord = this.cordHistory.get(this.cordHistory.size() - 1).get(0);
		this.yCoord = this.cordHistory.get(this.cordHistory.size() - 1).get(1);

	}

	public void moveLeft() {
		this.yCoord = this.yCoord-1;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(this.xCoord);
		cord.add(this.yCoord);
		this.cordHistory.add(cord);
	}
	public void moveRight() {
		this.yCoord = this.yCoord+1;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(this.xCoord);
		cord.add(this.yCoord);
		cordHistory.add(cord);
	}

	public void moveDown() {
		this.xCoord = this.xCoord+1;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(this.xCoord);
		cord.add(this.yCoord);
		cordHistory.add(cord);
	}
	public void moveUp() {
		this.xCoord = this.xCoord-1;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(this.xCoord);
		cord.add(this.yCoord);
		cordHistory.add(cord);
	}
	public void moveDownLeft() {
		this.yCoord = this.yCoord-1;
		this.xCoord = this.xCoord+1;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(this.xCoord);
		cord.add(this.yCoord);
		this.cordHistory.add(cord);
	}
	public void moveDownRight() {
		this.yCoord = this.yCoord+1;
		this.xCoord = this.xCoord+1;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(this.xCoord);
		cord.add(this.yCoord);
		this.cordHistory.add(cord);
	}
	public void moveUpLeft() {
		this.yCoord = this.yCoord-1;
		this.xCoord = this.xCoord-1;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(this.xCoord);
		cord.add(this.yCoord);
		this.cordHistory.add(cord);
	}
	public void moveUpRight() {
		this.yCoord = this.yCoord+1;
		this.xCoord = this.xCoord-1;
		ArrayList<Integer> cord = new ArrayList<>();
		cord.add(this.xCoord);
		cord.add(this.yCoord);
		this.cordHistory.add(cord);
	}
}

