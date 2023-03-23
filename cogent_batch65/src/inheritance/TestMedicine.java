package inheritance;
import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {

		Medicine[] arr=new Medicine[10];
		Random rand=new Random();
		
		
		for(int i=0;i<arr.length;i++) {
			int r=rand.nextInt(3)+1;
			
			if(r==1) {
				Tablet t=new Tablet();
				t.setCompanyAddress("Washington");
				t.setCompanyName("CVS");
				arr[i]=t;
			}
			if(r==2) {
				Syrup s=new Syrup();
				s.setCompanyAddress("Washington");
				s.setCompanyName("CVS");
				arr[i]=s;
			}
			if(r==3) {
				Ointment o=new Ointment();
				o.setCompanyAddress("Washington");
				o.setCompanyName("CVS");
				arr[i]=o;
			}
		}
		
		//print array results
		for(int j=0;j<arr.length;j++) {
			arr[j].displayLabel();
		}
		
	}

}
