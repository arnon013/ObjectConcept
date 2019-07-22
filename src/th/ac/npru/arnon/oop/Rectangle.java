package th.ac.npru.arnon.oop;

public class Rectangle extends shape {
	private int length;
	private int width;

	public Rectangle(int lengthValue, int widthValue) {
		length = lengthValue;
		width = widthValue;
	}

	@Override
	public double getArea() {
		area = length * width;
		return area;
	}

}