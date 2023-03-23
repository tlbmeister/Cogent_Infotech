package cogent_batch65;

public class BicycleTest {

	public static void main(String[] args) {

		ACMEBicycle bicycle=new ACMEBicycle();
		//bicycle.printStates();
		bicycle.changeCadence(10);
		bicycle.applyBrakes(1);
		bicycle.changeCadence(2);
		bicycle.speedUp(5);
		bicycle.printStates();
	}

}
