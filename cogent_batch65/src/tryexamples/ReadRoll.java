package tryexamples;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadRoll {
	
	public static void main(String[] args) {
		try {
			
			FileInputStream fis=new FileInputStream("/Users/trav/eclipse-workspace/cogent_batch65/src/tryexamples/rolls.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object obj=new Object();
			
			while((obj=(Object)ois.readObject())!=null) {
				Roll r=(Roll)obj;
				r.print();
			}
			
			ois.close();
			
			
			
			
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
