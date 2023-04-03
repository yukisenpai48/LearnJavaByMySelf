package bean;

//Class -> kiểu dữ liệu object
//chứa nhiều thông tin bên trong
// mỗi thông tin là 1 thuộc tính/đặc điểm của class
public class Item {
	public Item(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Item() {
	
	}
	//thuộc tính/ attributes
	public int id;
	public String name;
	public double price;
	
	

}
