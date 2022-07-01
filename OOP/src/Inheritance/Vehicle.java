package Inheritance;

public class Vehicle extends Object {
	
	private int id; 
	private int wheels; 
	private String make; 
	private String model;
	private String colour;
	private String engineSize; 
	

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int id, int wheels, String make, String model, String colour, String engineSize) {
		super();
		this.id = id;
		this.wheels = wheels;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.engineSize = engineSize;
	}

	public void start() {
		System.out.println("Vehicle is starting..");
	}
	
	public void stop() {
		System.out.println("vehicle is stopping..");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	

}
