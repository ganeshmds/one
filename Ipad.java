package OppsDay10;

public class Ipad {
	String brand;
	String model;
	int size;
	int price;
	MemoryCard memoryCard;
	
	public Ipad(String a,String b,int c,int d,MemoryCard m) {
		this.brand=a;
		this.model=b;
		this.price=c;this.size=d;this.memoryCard=m;
	}
		public String toString() {
			return brand+" "+model+" "+price+" "+size+" "+memoryCard;
	}

}
