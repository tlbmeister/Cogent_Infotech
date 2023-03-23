package cogent_batch65;
import esg.itp.shape.*;

public class PolygonTest {

	public static void main(String[] args) {
		Polygon s=new Square(3f);
		Polygon r=new Rectangle(2.5f,6f);
		s.calcArea();
		r.calcArea();
		s.calcPeri();
		r.calcPeri();
		s.display();
		r.display();
		

	}
}
