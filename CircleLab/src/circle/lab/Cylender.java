package circle.lab;

public class Cylender extends Circle{
private double height;
	
	public Cylender(double height) {
	super();
	this.height = height;
}

	public Cylender(double r, String c,double height) {
		super(r, c);
		this.height=height;
		// TODO Auto-generated constructor stub
	}
	public Cylender(double r,double height) {
		super(r);
		this.height=height;
		// TODO Auto-generated constructor stub
	}



	Cylender(){
	super();
	height=1.0;
}
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
public double getVolume() {
	return getArea()*height;
}
	
@Override
public String toString() { // in Cylinder class
// use Circle's toString()
return "Cylinder: subclass of " + super.toString()
+ " height=" + height;
}
	
}
