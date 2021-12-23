package Data_Structures.SortingMethods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

class testSorting {

	@Test
	void testCounting() {
		int[] a = {2,0,6,1,4,5,0,9,8,3};
		int[] b = {0,0,1,2,3,4,5,6,8,9};
		for(int i=0 ; i< b.length; i++) {
		assertEquals(b[i],ListOfSortingMethods.CountingSort(a, 0, 9)[i]);
		}
	}
	@Test
	void testRadix() {
		int[] a = {2,0,6,1,4,5,9,8,3};
		int[] b = {0,1,2,3,4,5,6,8,9};
		for(int i=0 ; i< b.length; i++) {
			assertEquals(b[i],ListOfSortingMethods.RadixSort(a, 1)[i]);
			}
	}
}
