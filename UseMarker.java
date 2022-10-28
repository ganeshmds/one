package OppsDay10;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1=new Marker("Mi",25,"Black");
		
		Marker m2=new Marker("Cello",30,"Blue");
		
		Marker m3=new Marker("Wright",45,"White");
		
			/*System.out.println(m1.brand+" "+m1.price+" "+m1.color+" \n"+
					m2.brand+" "+m2.price+" "+m2.color+
					" \n"+m3.brand+" "+m3.price+" "+m3.color);	*/
		System.out.println(m1+"\n"+m2+"\n"+m3);
	}
}
