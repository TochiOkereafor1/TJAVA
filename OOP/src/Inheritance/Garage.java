package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	private List<Vehicle> garage = new ArrayList<>();
	

	public void addToGarage(Vehicle vehicle) {
		garage.add(vehicle); 
	}
	
	public void removeFromGarage(Vehicle vehicle){
		garage.remove(vehicle);
	}
	
	
	public String removeVehicleByType (String make) {
		
		for(int i = 0; i <garage.size(); i++) {
			
			if(garage.get(i).getMake()==make) {
				garage.remove(i);
				
				return make;
			}
			
		}
		return null; 	
		
	}
	
	
	public int vehiclePrice(int pay) {
		//cost - price to give you the total
		
		
		return pay;
		
	}
		
	
	

}
