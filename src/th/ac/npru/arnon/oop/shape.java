package th.ac.npru.arnon.oop;


public abstract class shape {
	protected String color;
	protected double area;

	abstract double getArea();

	public String toString() {
		return "Color : " + color + "\nArea : " + area;
	}

	public void setColor(String colorValue) {
		color = colorValue;
	}
}

