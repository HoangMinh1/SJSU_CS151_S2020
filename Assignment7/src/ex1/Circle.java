package ex1;

class Circle extends Shape{

	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	protected double computeArea() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return "circle's " + "area: " +this.computeArea() ;
	}

}
