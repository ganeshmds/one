package OppsDay10;

public class Ac {
	private String name;
	private String model;
	private int price;
	private int capacity;
	private Compressor compressor;
	
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
	public void setCompressor( Compressor e) {
		this.compressor=e;
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
	public Compressor getCompressor() {
		return compressor;
	}
	public Ac(String a,String b,int c,int d,Compressor compressor) {
		this.name=a;
		this.model=b;
		this.price=c;
		this.capacity=d;
		this.compressor=compressor;
	}
	public String toString() {
		return getName()+" "+getModel()+" "+getPrice()+" "+getCapacity()+" "+getCompressor()+" "+
	compressor.getName()+" "+compressor.getModel()+" "+compressor.getPrice()+" "+compressor.getCapacity();
	}

}
