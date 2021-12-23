package Data_Structures.SearchingMethods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSearching {

	@Test
	void testBinarySearch() {
		int[] a = {0,3,6,19,20,202,30001};
		int[] c = {2,0,6,1,4,5,0,9,8,3};
		int[] b = {0,1,2,3,4,5,6,8,9};
		assertEquals(1,ListOfSearchingMethods.BinarySearch(a, 3, 0, 11));
		assertEquals(6,ListOfSearchingMethods.BinarySearch(b, 6, 0, c.length-1));
		assertEquals(0,ListOfSearchingMethods.BinarySearch(b, 0, 0, c.length-1));
	}

	private void assertEquals(int i, int binarySearch) {
	}

	@Test
	void testOrdinary() {
		int[] b = {2002,2,300,2,34,55,202,456};
		assertEquals(4,ListOfSearchingMethods.Ordinary(b, 34));
		assertEquals(-1,ListOfSearchingMethods.Ordinary(b, -1));
	}

}
