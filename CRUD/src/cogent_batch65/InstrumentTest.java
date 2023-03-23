package cogent_batch65;

public class InstrumentTest {

	public static void main(String[] args) {

		Instrument[] arr=new Instrument[10];
		Piano p=new Piano();
		Flute f=new Flute();
		Guitar g=new Guitar();
		
		arr[0]=p;
		arr[1]=f;
		arr[2]=g;
		arr[3]=p;
		arr[4]=f;
		arr[5]=g;
		arr[6]=p;
		arr[7]=f;
		arr[8]=g;
		arr[9]=p;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Piano) {
				System.out.println("This is a piano.");
			}else if(arr[i] instanceof Flute){
				System.out.println("This is a flute");
			}else if(arr[i] instanceof Guitar){
				System.out.println("This is a guitar");
			}
			arr[i].play();
		}
	}

}
