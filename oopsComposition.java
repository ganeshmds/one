package OppsDay10;

public class oopsComposition {
	public static void main(String[] args) {
		Battery b=new Battery();
		b.brand="Samsung";
		b.price=600;
		b.capacity=5000;
		
		Mobile m =new Mobile();
		m.brand="OppO";
		m.price=13000;
		m.color="Gold";
		m.battery=b;
		
		System.out.println(m.color+" "+m.price+" "+m.brand+"\n"+m.battery.brand+" "+m.battery.price+" "+m.battery.capacity);

	}

}
