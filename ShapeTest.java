import junit.framework.*;
import org.junit.Test;

public class ShapeTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void testRectangle() throws Exception {
		Rectangle rectangle = new Rectangle(6, 4);
		assertEquals(20.0, rectangle.perimeter());
		assertEquals(24.0, rectangle.area());
		assertEquals(false, rectangle.isSquare());
	}

	@Test
	public void testCarre() throws Exception {
		Rectangle carre = new Rectangle(5, 5);
		assertEquals(20.0, carre.perimeter());
		assertEquals(true, carre.isSquare());
	}

	@Test
	public void testCircle() throws Exception {
		Circle circle = new Circle(5);
		assertEquals(10 * Math.PI, circle.perimeter());
		assertEquals(25 * Math.PI, circle.area());
	}
}