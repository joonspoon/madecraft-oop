package examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessingAroundWithJUnit {

	@Test
	public void testName() throws Exception {
		assertEquals(4, 2+2);

	}
}
