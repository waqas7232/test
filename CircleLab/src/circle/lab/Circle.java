package circle.lab;

public class Circle {
private double radius;
private String color;
public Circle() {
	color="red";
	radius=1.0;
}
public Circle(double r) {
	this.radius=r;
}
public Circle(double r,String c) {
	this.radius=r;
	this.color=c;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public void setColor(String color) {
	this.color = color;
}
public double getRadius() {
	return radius;
}
public double getArea() {
	return (radius*radius)*Math.PI;

}
@Override
public String toString() {
	return "String object";
	
}



}
