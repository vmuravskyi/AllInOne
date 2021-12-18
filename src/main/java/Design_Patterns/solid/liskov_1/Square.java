package Design_Patterns.solid.liskov_1;

public class Square implements Shape {

	private int side;
	
	public Square(int side) {
		this.side = side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int computeArea() {
		return side * side;
	}
}
