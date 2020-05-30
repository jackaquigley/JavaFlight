import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {


    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(ModelType.BOEING747);
    }

    @Test
    public void canGetModel(){
        assertEquals(ModelType.BOEING747, plane.getModel());
    }
}
