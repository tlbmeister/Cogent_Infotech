package cogent_batch65;

public abstract class Bank {
	//an abstract method
	abstract float getRateOfInterest();
	
}

class SBIBank extends Bank{
	float rateOfInterest=7.25f;
	float getRateOfInterest() {
		return rateOfInterest;
	}
}

class HDFCBank extends Bank{
	float rateOfInterest=7.00f;
	float getRateOfInterest() {
		return rateOfInterest;
	}
}

class HSBC extends Bank{
	float rateOfInterest=8.00f;
	float getRateOfInterest() {
		return rateOfInterest;
	}
}
