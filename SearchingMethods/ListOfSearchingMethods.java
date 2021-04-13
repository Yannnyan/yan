package SearchingMethods;

public class ListOfSearchingMethods { // not tested + should work only for sorted
	public static int BinarySearch(int[] a, int k, int start, int end) {
		int half = (int)(start + end)/2;
		if(start >= end) return -1;
		if(a[half] == k) {return half;}
		else if(a[half] < k) {return BinarySearch(a,k,half,end);}
		else {return BinarySearch(a,k,start,half);}
	} // O(logn)
	public static int Ordinary(int[] a, int k) {
		for(int i=0; i < a.length; i++) {
			if(a[i] == k) {return i;}
		}
		return -1;
	}// O(n)
	
}
