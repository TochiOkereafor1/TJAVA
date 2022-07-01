package Inheritance;

public class Car extends Vehicle{
	
	
	private boolean wheelChairAccessible; 
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int id, int wheels, String make, String model, String colour, String engineSize, boolean wheelChairAccessible) {
		super(id, wheels, make, model, colour, engineSize);
		this.wheelChairAccessible = wheelChairAccessible; 
	}
	public void start() {
		System.out.println("Car is starting");
			
	}
	public void stop() {
		System.out.println("Car is stopping..");
	}
	public boolean isWheelChairAccessible() {
		return wheelChairAccessible;
	}
	public void setWheelChairAccessible(boolean wheelChairAccessible) {
		this.wheelChairAccessible = wheelChairAccessible;
	}
	
	


	
	
	



}
