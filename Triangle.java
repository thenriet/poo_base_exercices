package poo_base_exercices;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	private double distanceAB;
	private double distanceAC;
	private double distanceBC;

	public Triangle() {
		this.a = new Point();
		this.b = new Point();
		this.c = new Point();
		this.distanceAB = this.getDistanceAB();
		this.distanceAC = this.getDistanceAC();
		this.distanceBC = this.getDistanceBC();
	}

	public double getDistanceAB() {
		return Math.sqrt(Math.pow(this.b.getX() - this.a.getX(), 2) + Math.pow(this.b.getY() - this.a.getY(), 2));
	}

	public double getDistanceAC() {
		return Math.sqrt(Math.pow(this.c.getX() - this.a.getX(), 2) + Math.pow(this.c.getY() - this.a.getY(), 2));
	}

	public double getDistanceBC() {
		return Math.sqrt(Math.pow(this.c.getX() - this.b.getX(), 2) + Math.pow(this.c.getY() - this.b.getY(), 2));
	}

	public double getPerimeter() {
		return this.distanceAB + this.distanceAC + this.distanceBC;
	}

	public double getArea() {
		double s = this.getPerimeter()/2;
		return Math.sqrt(s*(s-this.distanceAB)*(s-this.distanceAC)*(s-this.distanceBC));
	}

	public void move(double x) {
		this.a.setX(this.a.getX()+x);
		this.a.setY(this.a.getY()+x);
		this.b.setX(this.b.getX()+x);
		this.b.setY(this.b.getY()+x);
		this.c.setX(this.c.getX()+x);
		this.c.setY(this.c.getY()+x);
	}

	public void downsize(double factor) {
		this.a.setX(this.a.getX()/factor);
		this.a.setY(this.a.getY()/factor);
		this.b.setX(this.b.getX()/factor);
		this.b.setY(this.b.getY()/factor);
		this.c.setX(this.c.getX()/factor);
		this.c.setY(this.c.getY()/factor);
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}
}
