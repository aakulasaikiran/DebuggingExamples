
public class Fraction {
	private int numarator;
	private int denaminater;

	public int getNumarator() {
		return numarator;
	}

	public void setNumarator(int numarator) {
		this.numarator = numarator;
	}

	public int getDenaminater() {
		return denaminater;
	}

	public void setDenaminater(int denaminater) {
		this.denaminater = denaminater;
	}

	public Fraction(int numarator, int denaminater) {
		super();
		this.numarator = numarator;
		this.denaminater = denaminater;
	}

	public Fraction(int number) {
		this(number, 1);
	}

	public Fraction add(Fraction that) {
		int num = (this.denaminater * this.numarator) + (this.numarator * this.denaminater);
		int den = (this.denaminater * this.denaminater);
		Fraction sum = new Fraction(num, den);

		return sum;

	}

}
