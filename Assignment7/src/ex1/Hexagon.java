package ex1;

class Hexagon extends Shape{
	private double side;
	
	Hexagon(double side){
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	protected double computeArea() {
		return (3* Math.sqrt(3) / 2) * side * side;
	}
	
	@Override
	public String toString() {
		return "hexagon's " + "area: " +this.computeArea() ;
	}

}
