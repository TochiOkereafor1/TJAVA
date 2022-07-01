package Inheritance;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		Car a = new Car(1, 4, "Aston Martin", "Vanquish", "Blue", "V8", false); 
		a.start();
		
		Car b = new Car(2, 4, "Toyota", "Prius", "White", "1.4L", false); 
		b.start();
		

		
		Motorbike a1 = new Motorbike(3, 2, "Ducati", "Panigale", "Red", "800cc",false); 
		a1.start();
		
		Garage garage = new Garage(); 
		garage.addToGarage(a);
		garage.addToGarage(b);
		garage.addToGarage(a1);
		
		
	
		
		
	
		
		
		
		

	}

}
