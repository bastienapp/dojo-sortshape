class Shape implements Comparable<Shape> {
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int compareTo(Shape compareShape) {

        double compareArea = compareShape.getArea();

        if (this.area > compareArea) {
            return 1;
        } else if (this.area < compareArea) {
            return -1;
        }

        return 0;
    }
}

class Square extends Shape {

    public Square(double side) {
        setArea(side * side);
    }
}

class Rectangle extends Shape {

    public Rectangle(double width, double height) {
        setArea(width * height);
    }
}

class Triangle extends Shape {

    public Triangle(double base, double height) {
        setArea(base * height / 2);
    }
}

class Circle extends Shape {

    public Circle(double radius) {
        setArea(Math.PI * radius * radius);
    }
}

class CustomShape extends Shape {

    public CustomShape(double area) {
        setArea(area);
    }
}
