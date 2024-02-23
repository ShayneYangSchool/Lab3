
public class Line {
	private double m;
	private double b;

	public Line(double m, double b) {
		this.m = m;
		this.b = b;
	}

	public Line(Point p1, Point p2) {
		this.m = Line.calcSlope(p1, p2);
		this.b = p1.getY() - (p1.getX() * this.m);
	}

	public boolean onLine(Point p, Line L) {
		if (p.getY() == Math.round((p.getX() * this.m) * 1000.0) / 1000.0 + this.b) {
			return true;
		} else {
			return false;
		}
	}

	static public double solveFor(double y, Line L) {
		return Math.round((y - L.getConstant()) / L.getSlope() * 1000.0) / 1000.0;
	}

	static double solveFor(Line L, double x) {
		return Math.round((x * L.getSlope() + L.getConstant()) * 1000.0) / 1000.0;
	}

	public String getEquation() {
		return "y = " + m + "x + " + b;
	}

	static double calcSlope(Point p1, Point p2) {
		double slope = ((p2.getY() - p1.getY()) / (p2.getX() - p1.getX()));
		return slope;
	}

	public double getSlope() {
		return this.m;
	}

	public double getConstant() {
		return this.b;
	}
}
