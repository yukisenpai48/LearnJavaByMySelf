package bean;

public class Rectangle {
	// attributes
	private int width;
	private int height;

	@Override
	public String toString() {
		return "width: " + width + "\nheight: " + height;
	}

	// constructor
	public Rectangle() {

	}

	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}

	
	
	//getter setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
