package th.ac.npru.arnon.oop;


public abstract class shape {
	String color;
	double area;

	abstract double getArea();

	public String toString() {
		return "Color : " + color + "\nArea : " + area;
	}

	void setColor(String colorValue) {
		color = colorValue;
	}
}

