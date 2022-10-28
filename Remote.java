package OppsDay10;

public class Remote {
	private int price;
	private String brand;
	
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public Remote(int price,String brand) {
		this.price=price;
		this.brand=brand;
	}
	public String toString () {
		return price+" "+brand;
	}
	}


