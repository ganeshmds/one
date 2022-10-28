package OppsDay10;

public class UseComputer {
	public static void main(String[] args) {
		Cpu c=new Cpu(12000,"Samsung","Mi34A",16,658);
		Computer c2=new Computer("Apple","Si45S",14500,c);
		System.out.println(c2.brand+" "+c2.model+" "+c2.price+" "+c2.cpu.brand+" "+c2.cpu.model);
	}	
}
