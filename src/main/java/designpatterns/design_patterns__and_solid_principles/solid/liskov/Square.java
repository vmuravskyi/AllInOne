package designpatterns.design_patterns__and_solid_principles.solid.liskov;

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
