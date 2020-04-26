package four;

public class Grade {
	public static final Grade Ap = new Grade(4.5);
	public static final Grade A = new Grade(4);
	public static final Grade Bp = new Grade(3.5);
	public static final Grade B = new Grade(3);
	public static final Grade Cp = new Grade(2.5);
	public static final Grade C = new Grade(2);
	public static final Grade Dp = new Grade(1.5);
	public static final Grade D = new Grade(1);
	public static final Grade F = new Grade(0);
	
	private double score;
	
	private Grade(double score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "score : " + score;
	}
	
	public double getValue() {
		return score;
	}
	
	
}
