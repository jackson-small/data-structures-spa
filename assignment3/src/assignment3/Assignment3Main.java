package assignment3;

public class Assignment3Main {
    public static void main(String[] args) {
        Mouse3 m = new Mouse3();
        Grid myGrid = new Grid(5, 3, 1, m);
        myGrid.printGrid();
        System.out.println();
        for (int element: m.scan(myGrid)) {
            System.out.print(element);
        }
        System.out.println();
        if(myGrid.getSpot(m.xCoord, m.yCoord)==1){
            m.moveDown();
        } else {
            myGrid.changeSpot(2);
        }
        while(m.scan(myGrid)[1]<10) {
            if(m.scan(myGrid)[0] == 0 && m.scan(myGrid)[1]==1){
                m.moveDown();
                myGrid.changeSpot(2);
            }
            else if(m.scan(myGrid)[0] == 0 && m.scan(myGrid)[1]==2){
                m.moveDownRight();
                myGrid.changeSpot(2);
            }else if(m.scan(myGrid)[0] == 0 && m.scan(myGrid)[1]==3){
                m.moveRight();
                myGrid.changeSpot(2);
            }else if(m.scan(myGrid)[0] == 0 && m.scan(myGrid)[1]==4){
                m.moveUpRight();
                myGrid.changeSpot(2);
            }else if(m.scan(myGrid)[0] == 0 && m.scan(myGrid)[1]==5){
                m.moveUp();
                myGrid.changeSpot(2);
            }else if(m.scan(myGrid)[0] == 0 && m.scan(myGrid)[1]==6){
                m.moveUpLeft();
                myGrid.changeSpot(2);
            }else if(m.scan(myGrid)[0] == 0 && m.scan(myGrid)[1]==7){
                m.moveLeft();
                myGrid.changeSpot(2);
            }else if(m.scan(myGrid)[0] == 0 && m.scan(myGrid)[1]==8){
                m.moveDownLeft();
                myGrid.changeSpot(2);
            }
            else if(m.scan(myGrid)[1]==9){
                m.moveBack();
            }
        }
        myGrid.printGrid();
        m.printInformation();
    }
}
