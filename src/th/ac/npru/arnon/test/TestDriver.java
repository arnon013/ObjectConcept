package th.ac.npru.arnon.test;

import th.ac.npru.arnon.oop.Rectangle;

public class TestDriver {

	public static void main(String[] args) {
		double area;
		
		Rectangle r1 = new Rectangle(4,6);
		area = r1.getArea();
		r1.setColor("Red");
		System.out.print("Area :"+area);
		System.out.print(r1.toString());

	}

}