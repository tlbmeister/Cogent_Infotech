package cogent_batch65;

public class GCDemo {

	int objId;
	GCDemo(int objId){
		this.objId=objId;
		
		System.out.println("Created: "+this.objId);
	}
	
	public static void main(String[] args) {
		for(int i=1;i<100;i++) {
			new GCDemo(i);
			System.gc();
		}
		
	}
	
	protected void finalize() throws Throwable{
		System.out.println("Finalized: "+this.objId);
	}

}
