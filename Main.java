
public class Main {

	public static void main(String[] args) {
		Point point1 = new Point (1, 2);
		Point point2 = new Point(-3, 4);
		Line line1 = new Line(1.2, 7.0);
		Line line2 = new Line(point1, point2);
		System.out.println(Line.calcSlope(point1,point2));
	}

}
