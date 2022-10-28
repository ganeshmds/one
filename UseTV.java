package OppsDay10;

public class UseTV {
	public static void main(String[] args) {
		Remote r=new Remote(100,"lg");
		TV t=new TV(3000,"MI",r);
		System.out.println(t.getBrand());
	}

}
