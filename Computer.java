package OppsDay10;

public class Computer {
	String brand;
	String model;
	int price;
	Cpu cpu;
	public Computer(String brand, String model, int price, Cpu cpu) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.cpu = cpu;
	}
	
//	private String brand;
//	private String model;
//	private int price;
//	private Cpu cpu;
	
//	public void setBrand(String a) {
//		this.brand=a;		
//	}
//	public void setModel(String b) {
//		this.model=b;
//	}
//	public void setprice(int c) {
//		this.price=c;
//	}
//	public void setCpu(Cpu d) {
//	this.cpu=d;
//	}
//	public String getBrand() {
//		return brand;
//	}
//	public String getModel() {
//		return model;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public Cpu getCpu() {
//		return cpu;
//	}
//	
//	public Computer(String a,String b,int c,Cpu d) {
//		this.brand =a ;
//		this.model=b;
//		this.price=c;
//		this.cpu=d;
//	}
//	public String toString() {
//		return getBrand()+" "+getModel()+" "+getPrice()+" "+cpu.getBrand()+" "+cpu.getModel()+" "+cpu.getPrice()+" "+cpu.getRam()+
//		cpu.getRom();
//	}
}

