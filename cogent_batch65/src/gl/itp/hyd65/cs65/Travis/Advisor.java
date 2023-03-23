package gl.itp.hyd65.cs65.Travis;

import java.util.Random;

public class Advisor {
	
	String message[]=new String[5];
	
	public Advisor() {
		message[0]="Never say no";
		message[1]="Never give up";
		message[2]="Never make promises";
		message[3]="Always get back up";
		message[4]="Make lots of friends";
	}
	
	public String getAdvice() {
		Random rand=new Random();
		int r=rand.nextInt(4)+1;
		return message[r];
	}

}
