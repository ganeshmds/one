package OppsDay10;

public class MemoryCard {
	String brand;
	String model;
	int size;
	int price;
	
	public MemoryCard(String a,String b,int c,int d) {
		this.brand=a;
		this.model=b;
		this.price=c;this.size=d;
	}
		public String toString() {
			return brand+" "+model+" "+price+" "+size;
	}

}
