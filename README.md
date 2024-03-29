## Shape

Create different shapes that can be part of a sortable list. The sort order is based on the size of their respective areas:

* The area of a Square is the square of its side
* The area of a Rectangle is width multiplied by height
* The area of a Triangle is base multiplied by height divided by 2
* The area of a Circle is the square of its radius multiplied by π

The default sort order of a list of shapes is ascending on area size:

	double side = 1.1234;
	double radius = 1.1234;
	double base = 5;
	double height = 2;

	ArrayList<Shape> shapes = new ArrayList<Shape>();
	shapes.add(new Square(side));
	shapes.add(new Circle(radius));
	shapes.add(new Triangle(base, height));

	Collections.sort(shapes);

Use the correct π constant for your circle area calculations:

	Math.PI

Rappel des commandes junit :

    javac -cp .:junit-4.12.jar ShapeTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore ShapeTest
