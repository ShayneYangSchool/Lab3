/*
Name: Shayne Yang
Teacher: Mr. Guglielmi
Date: 2024-02-22
Lab: Lab 3, Abstract Data Classes
Description: This program will create different instances of the Line and Point classes. THe program will check if a point is on a line, calculate the slope between 2 points and solve for x or y.
*/

public class Main {
	public static void main(String[] args) {
		// Initialize 10 different points
		Point p0 = new Point(0.0, 0.0);
		Point p1 = new Point(1.4, 3.5);
		Point p2 = new Point(-3.3, 4.2);
		Point p3 = new Point(4.0, 16.0);
		Point p4 = new Point(-0.2, -5.2);
		Point p5 = new Point(-8.3, 1.0);
		Point p6 = new Point(-57, -24);
		Point p7 = new Point(1.6, 6.7);
		Point p8 = new Point(-1.9, 6.3);
		Point p9 = new Point(9.1, -0.8);

		// Initialize 5 lines with slope and constant
		Line s0 = new Line(6.2, 0.0);
		Line s1 = new Line(9.4, 10.9);
		Line s2 = new Line(4.5, 16.2);
		Line s3 = new Line(1.2, 11.2);
		Line s4 = new Line(3.0, -17.3);
		// Initialize 5 lines with 2 points
		Line s5 = new Line(p0, p1);
		Line s6 = new Line(p2, p3);
		Line s7 = new Line(p4, p5);
		Line s8 = new Line(p6, p7);
		Line s9 = new Line(p8, p9);

		// Solve for x or y
		System.out.println("Solving for X:");
		System.out.println("x = " + Line.solveFor(0.0, s0));
		System.out.println("x = " + Line.solveFor(1.2, s1));
		System.out.println("x = " + Line.solveFor(9.3, s2));
		System.out.println("x = " + Line.solveFor(8.9, s3));
		System.out.println("x = " + Line.solveFor(1.7, s4));

		System.out.println("Solving for Y:");
		System.out.println("y = " + Line.solveFor(s5, 4.3));
		System.out.println("y = " + Line.solveFor(s6, 5.6));
		System.out.println("y = " + Line.solveFor(s7, 3.8));
		System.out.println("y = " + Line.solveFor(s8, 1.5));
		System.out.println("y = " + Line.solveFor(s9, 2.0));
		// Check if a point is on a line
		System.out.printf("Is point (%.1f,%.1f) on line %s: %b\n", p0.getX(), p0.getY(), s0.getEquation(),
				s0.onLine(p0, s0));
		System.out.printf("Is point (%.1f,%.1f) on line %s: %b\n", p1.getX(), p1.getY(), s1.getEquation(),
				s1.onLine(p1, s1));
		System.out.printf("Is point (%.1f,%.1f) on line %s: %b\n", p2.getX(), p2.getY(), s2.getEquation(),
				s2.onLine(p2, s2));
		System.out.printf("Is point (%.1f,%.1f) on line %s: %b\n", p3.getX(), p3.getY(), s3.getEquation(),
				s3.onLine(p3, s3));
		System.out.printf("Is point (%.1f,%.1f) on line %s: %b\n", p4.getX(), p4.getY(), s4.getEquation(),
				s4.onLine(p4, s4));
		System.out.println();

		// Calculate slope between 2 points
		System.out.println("Calculate Slope Between 2 Points");
		System.out.printf("Slope of point 0 and point 9 is: %.2f\n", Line.calcSlope(p0, p9));
		System.out.printf("Slope of point 1 and point 8 is: %.2f\n", Line.calcSlope(p1, p8));
		System.out.printf("Slope of point 2 and point 7 is: %.2f\n", Line.calcSlope(p2, p7));
		System.out.printf("Slope of point 3 and point 6 is: %.2f\n", Line.calcSlope(p3, p6));
		System.out.printf("Slope of point 4 and point 5 is: %.2f\n", Line.calcSlope(p4, p5));
	}

}
