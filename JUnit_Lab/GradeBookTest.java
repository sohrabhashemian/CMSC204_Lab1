//Sohrab Hashemian
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest
{
	private GradeBook g1 , g2;
	
	@Before
	public void setUp() throws Exception
	{
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(20.1);
		g1.addScore(99.9);
		g2.addScore(16.67);
		g2.addScore(33.33);
		g2.addScore(50.0);
	}

	@After
	public void tearDown() throws Exception
	{
		g1 = null;
		g2 = null;
	}

	@Test
	public void testSum()
	{
		assertEquals(120 , g1.sum() , 0.0001);
		assertEquals(100 , g2.sum() , 0.0001);
	}
	
	@Test
	public void testMinimum()
	{
		assertEquals(20.1 , g1.minimum() , 0.001);
		assertEquals(16.67 , g2.minimum() , 0.001);
	}
	
	@Test
	public void addScoreTest()
	{
		assertTrue(g1.toString().equals("20.1 99.9 "));
		assertTrue(g2.toString().equals("16.67 33.33 50.0 "));
	}
}
