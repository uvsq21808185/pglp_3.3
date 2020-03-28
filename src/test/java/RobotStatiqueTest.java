import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class RobotStatiqueTest {

	@Test
	public void testRobotStatique() {
		
		RobotStatique rbs = new RobotStatique(0);	
		Assert.assertNotNull(rbs);
		
		
	}
	@Test
	public void testAvance() {
		
		RobotStatique rbs = new RobotStatique(0);
		rbs.avance();
		assertTrue(rbs.getPosition()==0);
		
		
	}

}
