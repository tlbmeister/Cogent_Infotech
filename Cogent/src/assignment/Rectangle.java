package assignment;

public class Rectangle {
	
	int length;
	int bredth;
	
	public Rectangle()
	{
		this.length=0;
		this.bredth=0;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBredth() {
		return bredth;
	}

	public void setBredth(int bredth) {
		this.bredth = bredth;
	}
	
	public double calcArea(int l, int b) {
		return l*b;
	}
	
	public void display() {
		System.out.println("The length of the rectangle is: "+length);
		System.out.println("The bredth of the rectangle is: "+bredth);
		System.out.println("The area of the rectangle is: "+this.calcArea(length, bredth));
	}
}
