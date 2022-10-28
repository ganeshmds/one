package OppsDay10;

public class Compressor {
	private String name;
	private String model;
	private int price;
	private int capacity;
	
	public void setName(String a) {
		this.name=a;
	}
	public void setModel(String b) {
		this.model=b;
	}
	public void setPrice(int c) {
		this.price=c;
	}
	public void setCapacity(int d) {
		this.capacity=d;
	}
	
	public String getName() {
		return name;
		
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
	public int getCapacity() {
		return capacity;
	}
	public Compressor(String a,String b,int c,int d) {
		this.name=a;
		this.model=b;
		this.price=c;
		this.capacity=d;
	}
	public String toString() {
		return getName()+" "+getModel()+" "+getPrice()+" "+getCapacity();
}
}