
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class RobotTest {

	
	@Test
	public void testRobot() {
		
		Robot rb = new Robot(0);	
		Assert.assertNotNull(rb);
		
		
	}
	@Test
	public void testAvance() {
		
		Robot rb = new Robot(0);
		rb.avance();
		assertTrue(rb.position==100);
		
		
	}

}
