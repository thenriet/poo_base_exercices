package poo_base_exercices;
import java.lang.Math;

public class Point {
	private double x = Math.ceil(Math.random()*10); 
	private double y = Math.ceil(Math.random()*10);

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
}

