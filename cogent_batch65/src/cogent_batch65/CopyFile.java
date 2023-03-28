package cogent_batch65;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class CopyFile {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		FileReader fr=null;
		FileWriter fw=null;
		
//		System.out.println("Please enter a file name: ");
//		String input=sc.next();
//		System.out.println("Please enter another file name: ");
//		String output=sc.next();
		
		File f1=new File(args[0]);
		File f2=new File(args[1]);
		
		try {
			if(f2.exists()) {
				System.out.println("Would you like to overwrite this file? (yes/no)");
				String o=sc.next();
				if(o=="no") {
					System.out.println("You have chosen not to overwrite the file.");
					System.exit(0);
				}
			}
			fr=new FileReader(f1);
			fw=new FileWriter(f2);
			int ch;
			while((ch=fr.read())!=-1) {
				fw.write((char)ch);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
