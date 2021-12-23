package Data_Structures.SortingMethods;
import Data_Structures.SearchingMethods.*;
public class ListOfSortingMethods {
	
	public static void MergeSort(int[] b, int start, int end) {
	if(start/2 + end/2 == 1) return;
	MergeSort(b,(int)(start/2+end/2), end);
	int[] a1 = new int[end-start+1]; int[] b1 = new int[b.length-a1.length];
	Merge(a1,b1);
	MergeSort(b,start, (int)(start/2+end/2));
	

	}
	private static int[] Merge(int[] a, int[] b) {
		int[] merged = new int[a.length + b.length];
		int index =0;
		for(int i=0, k=0; i < a.length && k < b.length;) {
			if(a[i] < b[k]) {
				merged[index] = a[i]; ++index;
				++i;
			}
			else if(b[k] < a[i]) {
				merged[index] = b[i]; ++index;
				++k;
			}
			else {
				merged[index] = a[i]; ++index;
				++i;
				merged[index] = b[k]; ++index;
				++k;
			}
		}
		return merged;
		
	}
	
	public static int[] BubbleSort(int[] a) {
		for(int i=0; i< a.length; i++) {
			for(int k =0; k < a.length; k++) {
				if(a[i] >= a[k]) {
					int temp = a[i+1];
					a[i+1] = a[i];
					a[i] = temp;
				}
			}
		}
		return a;
	}//O(n^2)
	public static int[] InsertionSort(int[] a) {
		for(int i=0; i< a.length; i++) {
			for(int k=0; k < a.length; k++) {
				if(a[k] < a[i]) {
					int temp = a[k];
					a[k] = a[i];
					a[i] = temp;
				}
			}
		}
		return a;
	}//O(n^2)
	public static int[] CountingSort(int[] a, int MinRange, int MaxRange) {
		int[] integ = new int[MaxRange-MinRange+1];
		for(int i=0; i<a.length; i++) {
			integ[a[i]-MinRange] += 1;
		}
		int[] ret = new int[a.length];
		int index=0;
		for(int i=0; i< integ.length; i++) {
			for(int k=integ[i]; k>0; k--) {
				ret[index] = MinRange + i; ++index;
			}
		}
		return ret;
	} // O(n)
	
	public static int[] RadixSort(int[] a, int length) {
		for(int i=1; i<= length; i++) {
			int[] radix = new int[a.length];
			for(int k=0; k<a.length; k++) {
				int x = (int) (a[k] % Math.pow(10, i));
				int x1 = (int)  (a[k] % Math.pow(10, i-1));
				int r = (int)((x-x1)/(Math.pow(10, i-1)));
				radix[k] = r;
			}
		int[] p = CountingSort(radix,0,9);
		for(int k=0; k< radix.length; k++) {
		int index =ListOfSearchingMethods.BinarySearch(p, radix[k], 0, p.length);
		swap(radix,index,k);
		swap(a,index,k);
		
		}
		}
		
		return a;
	}
	private static int[] swap(int[] a, int index0, int index1) {
		int temp = a[index0];
		a[index0] = a[index1];
		a[index1] = temp;
		return a;
	}
	
}
