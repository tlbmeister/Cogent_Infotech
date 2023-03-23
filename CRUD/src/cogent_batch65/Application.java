package cogent_batch65;

public class Application {
	
	public static void main(String[] args) {
		
		Bank bank=new SBIBank();
		System.out.println(bank.getRateOfInterest());
		
		bank=new HDFCBank();
		System.out.println(bank.getRateOfInterest());
		
		bank=new HSBC();
		System.out.println(bank.getRateOfInterest());
	}

}
