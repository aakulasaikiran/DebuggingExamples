
public class FractionTester {

	public static void main(String[] args) {
		
		Fraction f=new Fraction(3,4);
		Fraction g=new Fraction(7,8);
		Fraction[] myfractions=new Fraction[4];
		Fraction sum=f.add(g);
		
		
		myfractions[0]=f;
		myfractions[1]=g;
		
		myfractions[3]=sum;
		
		System.out.println(myfractions[3].toString());
		
		
	}

}
