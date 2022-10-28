package OppsDay10;

public class UseAc {
	public static void main(String[] args) {
		Compressor c=new Compressor("Huawei","Dm08",7800,5000);
			Ac a=new Ac("Croma","Ta45",45000,4500,c);
		Ac [] d= {a};
		for(Ac x:d) {
			if (x.getPrice()>=45000) {
				System.out.println(a.getName()+" "+c.getName());
			}
		}	
	}
}
