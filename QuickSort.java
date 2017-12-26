import java.util.*;

class QuickSort{
	public static int partition(int[] a, int p,int r){
		// a  = array of elements , p = starting index , r = end index
		int i = p-1;
		for(int j = p;j<r;j++){
			if(a[j] < a[r]){
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i+1];
		a[i+1] = a[r];
		a[r] = temp;
		return i+1;
	}
	
	public static void quickSort(int[] a, int p,int r){
		if(p<r){
			int q = partition(a,p,r);
		
			quickSort(a,p,q-1);
			quickSort(a,q+1,r);
		}
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = in.nextInt();
		}
		
		quickSort(a,0,n-1);
		for(int i : a){
			System.out.print(i+" ");
		}
	}
}