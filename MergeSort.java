import java.util.*;
import java.io.*;

public class MergeSort{
	
	static void merge(int[] A,int p,int r,int q){
		//System.out.println("merge Call");
		int n1 = r - p + 1;// n1 = no. of elements in the left half of the array
		int n2 = q-r; // (r+1)-q+1 == r-q 'n2 = no of elements in the right half of the array'
		int[] B = new int[n1+1];
		int[] C = new int [n2+1];
		
		//System.out.println("n1: "+n1+"\t"+"n2: "+n2);
		
		for(int i = 0;i<n1;i++){ // Copy all elements from A[p->r] to B[]
			B[i] = A[i+p];
		}
		for(int i = 0;i<n2;i++){ // Copy all elements from A[r+1 -> q] to C[]
			C[i] = A[i+r+1];
		}
		
		B[n1] = Integer.MAX_VALUE;
		C[n2] = Integer.MAX_VALUE;
		int i = 0, j =0;
		//System.out.println(B[n1] + "\t"+C[n2]);
		
		for (int k = p;(k<=q);k++){
			//System.out.println("i: "+i+"   j: "+j+"   k: "+k);
			if(B[i] <= C[j]){
				A[k] = B[i];
				i++;
			}
			else{
				A[k] = C[j];
				j++;
			}
		}
		
	}
	
	static void mergeSort(int[] A,int p,int q){
		if(p >= q){
			//Do nothing, The array is already sorted, cause if p>= q , 
			//that means the array is either empty or consisti's of one element
			
		}
		else{
			//System.out.println("Sort Call");
			int r = (p+q)/2;
			//System.out.println("p: "+p+"  q: "+q+"   r: "+r);
			mergeSort(A, p, r);
			mergeSort(A, r+1 ,q);
			merge(A,p,r,q);
		}
		
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = in.nextInt();
		}
		mergeSort(a,0,n-1);
		for(int i : a){
			System.out.println(i);
		}
	}
}