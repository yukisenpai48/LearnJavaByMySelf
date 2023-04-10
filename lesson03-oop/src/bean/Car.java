package bean;

public class Car {
	private static String model;
	
	
	private String color;
	private int serial;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", serial=" + serial + "]";
	}
	
	public Car(int serial, String color) {
		this.color = color;
		this.serial = serial;
	}
	public Car() {
		
	}
	
	
}
