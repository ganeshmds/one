package OppsDay10;

public class UseBank {
	public static void main(String[] args) {
		Bank b=new Bank();
		b.setName("Ganesh");
		b.setAccountNo(6142);
		b.setBalance(56);
		
		Bank b1=new Bank();
		b1.setName("Isai");
		b1.setAccountNo(1740);
		b1.setBalance(8);
		
		Bank b2=new Bank();
		b2.setName("Pavithran");
		b2.setAccountNo(1749);
		b2.setBalance(8);
		
		Bank[] d= {b,b1,b2};
		for(Bank z:d) {
			if(z.getBalance()>50) {
				System.out.println("Accountant Name:"+z.getName()+"\nAccount No: "+z.getAccountNo());
			}
			else {
				System.out.println("Accountant Name:"+z.getName());
			}
		}		
	}

}
