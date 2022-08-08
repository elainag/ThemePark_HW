package attractions;

import behaviours.ITicketed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest  {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(25, 205, 50.50);
        visitor2 = new Visitor(10, 120, 5.50);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }
    @Test
    public void defaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }
    @Test
    public void priceFor(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor1), 0.0);
    }
}
