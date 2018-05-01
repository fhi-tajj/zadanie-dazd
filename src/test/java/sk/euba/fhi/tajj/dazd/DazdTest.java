package sk.euba.fhi.tajj.dazd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Igor Banduric.
 */
public class DazdTest {

	private Dazd dazd; //FIXME

	@Test
	public void testDveTri() {
		assertEquals( 2, this.dazd.priemerZrazok( Arrays.asList( 1, 2, 3, 999999, 5, 6 ) ), 0.1 );
		assertEquals( 3, this.dazd.priemerZrazok( Arrays.asList( 1, -2, 5, 999999, 10 ) ), 0.1 );
		assertEquals( 5, this.dazd.priemerZrazok( Arrays.asList( 2, 4, 6, 8, 999999, 10 ) ), 0.1 );
	}
}
