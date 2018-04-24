public class Equation {
	int a; int b; int c;
	double x1, x2;
	String ans;
	public Equation(int ai, int bi, int ci) {
		a = ai;
		b = bi;
		c = ci;
	}
	public Equation() {
		this.a = 1;
		this.b = 2;
		this.c = 1;
	}
	
	private double Discr() {
		return this.b*this.b-4*this.a*this.c;
	}

	public void Solve() {
		if(Discr() >= 0) {
			x1=-1*this.b+Math.sqrt(Discr())/2/this.a;
			x2=-1*this.b+Math.sqrt(Discr())/2/this.a;
		} else {
			x1 = 0;
			x2 = 0;
		}
		ans = x1 + " " + x2;
	}

}
