import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestShape {
    private Rectangle rectangle;
    private Square square;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle();
        square = new Square();
    }

    @Test
    public void testRectangle() {
        rectangle.setWidth(4);
        rectangle.setHeight(5);
        Assert.assertEquals(rectangle.computeArea(), 20);
    }
    @Test
    public void testSquare() {
        square.setEdge(5);
        Assert.assertEquals(square.computeArea(), 25);
    }
}

