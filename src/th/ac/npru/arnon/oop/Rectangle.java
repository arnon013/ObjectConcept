package th.ac.npru.arnon.oop;

public class Rectangle extends shape {
	int length;
	int width;

	Rectangle(int lengthValue, int widthValue) {
		length = lengthValue;
		width = widthValue;
	}

	@Override
	double getArea() {
		area = length * width;
		return area;
	}

}