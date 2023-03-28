package tryexamples;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWriteExample {

	public static void main(String[] args) {

		FileReader fr=null;
		FileWriter fw=null;
		
		try {
			fr=new FileReader("/Users/trav/eclipse-workspace/cogent_batch65/src/tryexamples/employee.txt");
			fw=new FileWriter("/Users/trav/eclipse-workspace/cogent_batch65/src/tryexamples/newemployee.txt");
			int ch;
			
			while((ch=fr.read())!=-1) {
				fw.write((char)ch);
			}
			fr.close();
			fw.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
