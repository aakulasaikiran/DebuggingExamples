
public class CS2401_Eclipse {

	public static void main(String[] args) {
		
		print_nums(4);
		
	}
	public static void print_nums(int n) {
		
		if(n>0) {
			String s=" ";
			for(int i=1;i<=n;i++) {
				s=s+i;
			}
			print_nums(n-1);
			System.out.println(s);
		}
		
		
		
	}

}
