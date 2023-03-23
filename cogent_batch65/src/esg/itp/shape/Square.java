package esg.itp.shape;

public class Square implements Polygon{
	float side;
	float area;
	float perimeter;
	
	public Square(float s) {
		this.side=s;
	}
	
	public void calcArea() {
		area=side*2;
	}
	
	public void calcPeri() {
		perimeter=side*4;
	}
	
	public void display() {
		System.out.println("Area of the square is: "+area);
		System.out.println("Perimeter of the square is: "+perimeter);
	}
	
	
}
