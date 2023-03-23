package cogent_batch65;
import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {

		Compartment[] c=new Compartment[10];
		Random rand=new Random();
		
		for(int i=0;i<c.length;i++) {
			int r=rand.nextInt(4)+1;
			if(r==1) {
				Compartment fc=new FirstClass();
				c[i]=fc;
			}else if(r==2) {
				Compartment l=new Ladies();
				c[i]=l;
			}else if(r==3) {
				Compartment g=new General();
				c[i]=g;
			}else if(r==4) {
				Compartment lug=new Luggage();
				c[i]=lug;
			}
		}
		for(int j=0;j<c.length;j++) {
			c[j].notice();
		}
		
	}

}
