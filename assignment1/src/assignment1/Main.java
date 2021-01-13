package assignment1;

public class Main {
	public static void main(String[] args) {
		Mouse m = new Mouse("Charles", 2, 2);
		m.moveUp();
		m.moveUp();
		m.moveLeft();
		m.moveDown();
		m.moveRight();
		m.printInformation();
	}

}
