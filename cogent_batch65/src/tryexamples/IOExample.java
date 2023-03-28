package tryexamples;
import java.io.*;

public class IOExample {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("/Users/trav/eclipse-workspace/cogent_batch65/src/tryexamples/employee.txt");
			fos=new FileOutputStream("/Users/trav/eclipse-workspace/cogent_batch65/src/tryexamples/newemployee.txt");
			int i=0;
			while(i!=-1) {
				i=fis.read();
				fos.write((char)i);
			}
			fis.close();
			fos.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
