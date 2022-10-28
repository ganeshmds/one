package OppsDay10;

public class Marker {
	String brand;
	int price;
	String color;
	
	Marker(String brand,int price,String color){
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public String toString() {
		return brand+" "+price+" "+color;
	}

}
