class Circle implements Shape {
	
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}

	public double area() {
		return Math.PI * this.radius * this.radius;
	}
}
