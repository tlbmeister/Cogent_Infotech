package inheritance;

public class Medicine {
	String companyName;
	String companyAddress;
	
	
	
	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getCompanyAddress() {
		return companyAddress;
	}



	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}



	public void displayLabel() {
		System.out.println("The company name is: "+companyName);
		System.out.println("The company address is: "+companyAddress);
	}
}
