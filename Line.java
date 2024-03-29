
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

	public double solveForX(double y) {
		return Math.round((y - this.b) / this.m * 1000.0) / 1000.0;
	}

	public double solveForY(double x) {
		return Math.round((x * this.m	+ this.b) * 1000.0) / 1000.0;
	}

	public String getEquation() {
		return "y = " + m + "x + " + b;
	}

	static double calcSlope(Point p1, Point p2) {
		double slope = ((p2.getY() - p1.getY()) / (p2.getX() - p1.getX()));
		return slope;
	}
}
