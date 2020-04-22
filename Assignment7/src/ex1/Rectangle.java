package ex1;

class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	protected double computeArea() {
		return length * width;
	}
	@Override
	public String toString() {
		return "rectangle's " + "area: " +this.computeArea() ;
	}

}
