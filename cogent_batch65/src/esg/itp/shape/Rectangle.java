package esg.itp.shape;

public class Rectangle implements Polygon{
	float length;
	float bredth;
	float area;
	float perimeter;
	
	public Rectangle(float len, float bre) {
		this.length=len;
		this.bredth=bre;
	}
	
	public void calcArea() {
		area=length*bredth;
	}
	
	public void calcPeri() {
		perimeter=(length*2)+(bredth*2);
	}
	
	public void display() {
		System.out.println("The area of the rectangle is: "+area);
		System.out.println("The perimeter of the rectangle is: "+perimeter);
	}
	
	
}
