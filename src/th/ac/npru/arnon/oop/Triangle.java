package th.ac.npru.arnon.oop;

public class Triangle extends shape {
	int base;
	int height;

	Triangle(int baseValue, int heightValue) {
		base = baseValue;
		height = heightValue;
	}

	@Override
	double getArea() {
		area = 0.5 * base * height;
		return area;
	}

}