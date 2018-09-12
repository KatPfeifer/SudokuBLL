package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest2 {

	@Test
	public void containsZeroTest() {
		
		int [][] mySquare= {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(mySquare);
		assertEquals(false, ls.containsZero());
		mySquare[1][2]=0;
		assertEquals(true, ls.containsZero());
	}
	@Test
	public void hasDuplicatesTest1() {
		int[]arr= {1,2,3,4,5};
		LatinSquare lq=new LatinSquare(null);
		assertFalse(lq.hasDuplicates(arr));
	}
	@Test
	public void hasDuplicatesTest2() {
		int[]arr= {1,2,3,1,5};
		LatinSquare lq=new LatinSquare(null);
		assertTrue(lq.hasDuplicates(arr));
	}
	@Test
	public void hasAllValuesTest() {
		int [] a = {1,2,3,4};
		int [] b = {2,3,4,1};
		LatinSquare la=new LatinSquare(null);
		assertTrue(la.hasAllValues(a, b));
	}
	@Test
	public void hasAllValuesTest2() {
		int [] a = {1,2,3,5};
		int [] b = {2,3,4,1};
		LatinSquare la=new LatinSquare(null);
		assertFalse(la.hasAllValues(a, b));
	}
}
