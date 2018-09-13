package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

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
	@Test
	public void doesElementExistTest() {
		int [] a= {1,2,3,4};
		int num=5;
		LatinSquare ls= new LatinSquare(null);
		assertFalse(ls.doesElementExist(a,num));
	}
	@Test
	public void doesElementExistTest2() {
		int [] a= {1,2,3,4};
		int num=3;
		LatinSquare ls= new LatinSquare(null);
		assertTrue(ls.doesElementExist(a,num));
		assertEquals(true, ls.doesElementExist(a, num));
	}
	@Test
	public void getColumnTest() {
		int [][] Square= {{1,2,3},{2,3,1},{3,1,2}};
		int a = 1;
		LatinSquare ls = new LatinSquare(Square);
		int [] testArray= {2,3,1};
		assertTrue(Arrays.equals(testArray,ls.getColumn(a)));
	}
	@Test
	public void getColumnTest2() {
		int [][] Square= {{1,2,3},{2,4,1},{3,1,2}};
		int a = 1;
		LatinSquare ls = new LatinSquare(Square);
		int [] testArray= {2,3,1};
		assertFalse(Arrays.equals(testArray,ls.getColumn(a)));
	}
	@Test
	public void getRowTest() {
		int[][] square = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(square);
		int a = 0;
		int[] tstArray = {1,2,3};
		assertTrue(Arrays.equals(tstArray, ls.getRow(a)));
	}
	@Test
	public void getRowTest2() {
		int[][] square = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(square);
		int a = 2;
		int[] tstArray = {3,1,2};
		assertTrue(Arrays.equals(tstArray, ls.getRow(a)));
	}
	@Test
	public void getRowTest3() {
		int[][] square = {{1,2,3,4},{2,3,4,1},{3,4,1,2},{4,1,2,3}};
		LatinSquare ls = new LatinSquare(square);
		int a = 3;
		int[] tstArray = {4,1,2,3};
		assertTrue(Arrays.equals(tstArray, ls.getRow(a)));
	}
	@Test
	public void getRowTest4() {
		int[][] square = {{6,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(square);
		int a = 0;
		int[] tstArray = {1,2,3};
		assertFalse(Arrays.equals(tstArray, ls.getRow(a)));
	}
	@Test
	public void getLatinSquareTest() {
		int[][] square = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(square);
		int[][] ttArray = {{1,5,3},{2,3,1},{3,1,2}};
		assertFalse(Arrays.equals(ttArray, ls.getLatinSquare()));
	}
	@Test
	public void isLatinSquareTest() {
		int [][] LSquare= {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(LSquare);
		assertTrue(ls.isLatinSquare(LSquare));
	}
	@Test
	public void isLatinSquareTest2() {
		int [][] LSquare= {{1,4,5},{4,3,1},{3,1,4}};
		LatinSquare ls = new LatinSquare(LSquare);
		assertFalse(ls.isLatinSquare(LSquare));
	}
	@Test
	public void isLatinSquareTest3() {
		int [][] LSquare= {{1,4,4},{4,3,1},{3,1,4}};
		LatinSquare ls = new LatinSquare(LSquare);
		assertFalse(ls.isLatinSquare(LSquare));
	}
	@Test
	public void isLatinSquareTest4() {
		int [][] LSquare= {{1,4,3},{4,1,3},{3,1,4}};
		LatinSquare ls = new LatinSquare(LSquare);
		assertFalse(ls.isLatinSquare(LSquare));
	}
	@Test
	public void isLatinSquareTest5() {
		int [][] LSquare= {{1,3,3},{4,1,3},{3,1,4}};
		LatinSquare ls = new LatinSquare(LSquare);
		assertFalse(ls.isLatinSquare(LSquare));
	}
	@Test
	public void getSetTest() {
		int [][] mySquare= {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(mySquare);
		ls.setLatinSquare(mySquare);
		int [][] newSquare= ls.getLatinSquare();
		assertTrue(Arrays.equals(mySquare, newSquare));
	}
	@Test
	public void getSetTest2() {
		int [][] mySquare= {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(mySquare);
		ls.setLatinSquare(mySquare);
		int [][] newSquare= ls.getLatinSquare();
		int [][] otherSquare= {{2,3,1},{3,1,2},{1,2,3}};
		assertFalse(Arrays.equals(otherSquare, newSquare));
	}
}