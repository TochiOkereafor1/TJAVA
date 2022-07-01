package Inheritance;

public class Motorbike extends Vehicle {
	
	private boolean sideCar; 
	
	
	

	public Motorbike() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Motorbike(int id, int wheels, String make, String model, String colour, String engineSize, boolean sideCar) {
		super(id, wheels, make, model, colour, engineSize);
		this.sideCar = sideCar; 
	}
	public void start () {
		System.out.println("bike is starting");
	}
	
	public void stop() {
		System.out.println("bike stopping");
	}
	



	public boolean isSideCar() {
		return sideCar;
	}



	public void setSideCar(boolean sideCar) {
		this.sideCar = sideCar;
	}
	
	public static void startEngine() {
		System.out.println("Engine noise");
	}



	

}
