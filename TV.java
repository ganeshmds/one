package OppsDay10;

public class TV {
	private String brand;
	private int price;
	private Remote remote;
	
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBrand(int Brand) {
		this.brand=brand;		
	}
	public void setRemote(int Remote) {
		this.remote=remote;
		
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public Remote getRemote() {
		return remote;
	}
	public TV(int price,String brand,Remote remote) {
		this.price=price;
		this.brand=brand;
		this.remote=remote;
	}
	public String toString() {
		return price+" "+brand+" "+remote.getPrice()+" "+remote.getBrand();
	}


}
