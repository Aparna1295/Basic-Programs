
public class Circle {
	private static final double PI = 3.14;
	private final String shape;
	private final double radius;
	double area;
	public Circle(String shape, double radius) {
		this.shape=shape;
		this.radius=radius;
		
	}

	public double calculateAreaOfCircle(double rad) {
		area = 2*PI*radius;
		return area;
	
	}
	
	public String toString()
	{
		return "Area of " +shape+": " +area;
	}
	public static void main(String[] args) {
		double rad = Double.parseDouble(args[0]);
		Circle c = new Circle("Circle",0.65);
		Circle c1 = new Circle("Circle1",10.65);
		double a1 = c.calculateAreaOfCircle(rad);
		double a2 = c1.calculateAreaOfCircle(rad);
		System.out.print(" "+(a1+a2));
	}

}
