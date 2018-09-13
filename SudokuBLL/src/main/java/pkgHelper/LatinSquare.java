package pkgHelper;

import java.util.Arrays;

public class LatinSquare {
 private int[][]myLatinSquare;
 
 public LatinSquare(int [][] myLatinSquare) {
	 super();
	 this.myLatinSquare = myLatinSquare;
 }
 public void setLatinSquare(int[][] mylatinsquare) {
	 myLatinSquare=mylatinsquare;
 }
 public boolean containsZero() {
	 for(int iCol=0; iCol<myLatinSquare.length; iCol++) {
		 for (int iRow=0; iRow<myLatinSquare.length; iRow++) {
			 if (myLatinSquare[iCol][iRow]==0) {
				 return true;
			 }
		 }
	 }
	 return false;
 }
 public boolean doesElementExist(int[] arr, int iValue) {
	 for (int i=0; i<arr.length; i++) {
		 if (arr[i]==iValue) {
			 return true;
		 }
	 }
	 return false;
 }
 
 public int[] getRow(int iRow) {
	int [] row = new int[myLatinSquare.length];
	for (int i=0; i<myLatinSquare.length; i++) {
		row[i]=myLatinSquare[i][iRow];
	}
	return row;
 }
 public int[][] getLatinSquare() {
	 return myLatinSquare;
 }
 public int[] getColumn(int iCol) {
	 return myLatinSquare[iCol];
 }
 public boolean hasAllValues(int [] arr1, int [] arr2) {
	 int countSame=0;
	 for (int i=0; i<arr1.length; i++) {
		 for (int k=0; k<arr2.length; k++) {
			 if (arr1[i]==arr2[k]) {
				 countSame++;
			 }
		 }
	 }
	 if (countSame==arr1.length) {
		 return true;
	 }
	 else {
		 return false;
	 }
 }
 
  public boolean hasDuplicates(int[] arr) {
	 boolean hasDuplicates=false;
	 Arrays.sort(arr);
	 for (int i=0; i<arr.length-1; i++) {
		 if (arr[i]==arr[i+1]) {
			 hasDuplicates=true;
			 break;
		 }
	 }
	 return hasDuplicates;
 }
  public boolean isLatinSquare(int [][]arr) {
	  int [] row = getRow(0);
	  int [] column = getColumn(0);
	  for (int i=0; i<arr.length; i++) {
		  int [] columni=getColumn(i);
		  int [] rowi=getRow(i);
		  System.out.println("i= "+ i);
		  if (hasDuplicates(columni)==true) {
			  System.out.println("got to first false");
			  return false;
		  }
		  if (hasDuplicates(rowi)==true) {
			  System.out.println("got to second false");
			  for (int j = 0; j<rowi.length; j++) {
				  System.out.print(rowi[j]);
			  }
			  return false;
		  }
		  else {
			  for (int k = 1; k<arr.length; k++) {
				  if (hasAllValues(getRow(k), row)==false) {
				  return false;
				  }
				  if (hasAllValues(getColumn(k), column)==false) { 
					  return false;
				  }
			  }
		  }
	  }
	  return true;
  }
}