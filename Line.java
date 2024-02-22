
public class Line {
	private double x;
	private double m;
	private double b;
	private double y;
	public Line (double m, double b) {
		this.m = m;
		this.b = b;
	}
	
	public Line (Point p1, Point p2) {
		this.m = Line.calcSlope(p1, p2);
		this.b = p1.getY()-p1.getX()*this.m;
	}
	public boolean onLine (Point p, Line L) {
		if (p.getX()==(p.getY()*this.m)+this.b) {
			return true;
		} else {
			return false;
		}
	}
	static double calcSlope(Point p1, Point p2) {
		double slope = ((p2.getY()-p1.getY())/(p2.getX()-p1.getX()));
		return slope;
	}
}
