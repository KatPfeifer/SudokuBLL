package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;


public class LatinSquareTest {
	public void containsZeroTest() {
		int [][] mySquare= {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(mySquare);
		assertFalse(ls.containsZero());
			
	}

}