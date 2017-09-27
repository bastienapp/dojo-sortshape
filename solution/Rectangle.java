class Rectangle implements Shape {
	
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public double perimeter() {
		return (this.width + this.height) * 2;
	}

	public double area() {
		return this.width * this.height;
	}

	public boolean isSquare() {
		return this.width == this.height;
	}
}
