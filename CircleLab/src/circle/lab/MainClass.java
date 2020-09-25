package circle.lab;

public class MainClass {
public static void main(String[] args) {
	Cylender c1 = new Cylender();
	System.out.println("Cylinder:"
	+ " radius=" + c1.getRadius()
	+ " height=" + c1.getHeight()
	+ " base area=" + c1.getArea()
	+ " volume=" + c1.getVolume());
	// Declare and allocate a new instance of cylinder
	// specifying height, with default color and radius
	Cylender c2 = new Cylender(10.0);
	System.out.println("Cylinder:"
	+ " radius=" + c2.getRadius()
	+ " height=" + c2.getHeight()
	+ " base area=" + c2.getArea()
	+ " volume=" + c2.getVolume());
	// Declare and allocate a new instance of cylinder
	// specifying radius and height, with default color
	Cylender c3 = new Cylender(2.0, 10.0);
	System.out.println("Cylinder:"
	+ " radius=" + c3.getRadius()
	+ " height=" + c3.getHeight()
	+ " base area=" + c3.getArea()
	+ " volume=" + c3.getVolume());

}
}
