package ex1;

class Triangle extends Shape{
	private double base;
	private double height;
	
	Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	protected double computeArea() {
		return 0.5 * base * height;
	}
	
	@Override
	public String toString() {
		return "triangle's " + "area: " +this.computeArea() ;
	}

}
