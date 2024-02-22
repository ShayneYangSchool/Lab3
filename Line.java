
public class Line {
	private int x;
	private int m;
	private int b;
	private int y;
	public Line (int m, int b) {
		this.m = m;
		this.b = b;
	}
	
	public Line (Point p1, Point p2) {
		
	}
	public boolean onLine (Point p, Line L) {
		if (p.getX()==(p.getY()*this.m)+this.b) {
			return true;
		} else {
			return false;
		}
	}
	static double calcSlope(Point p1, Point p2) {
		double slope = ((p1.getY()-p2.getY())/(p1.getX()-p2.getX()));
		return slope;
	}
}
