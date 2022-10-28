package OppsDay10;

public class UseLaptop {
	public static void main(String[] args) {
		Battery b=new Battery();
		b.brand="Samsung1";
		b.capacity=6000;
		b.price=500;
	
		Laptop l= new Laptop();
		l.brand="Dell";
		l.model="L7400";
		l.memorySize=16;
		l.price=12400;
		l.battery = b;
		
		System.out.println(l.brand+" "+l.model+" "+l.memorySize+" "+l.price+"\n"+l.battery.brand+" "+ 
		l.battery.capacity+" "+l.battery.price);
}

	
}