import java.util.*;
import java.io.*;

class BinarySearch {
	//Binary search works only in a sorted array. Time complexity : O(log n)
	public static int binarySearch(int[] A,int p,int q,int x){
		//This is the recursive implementation of binary search
		if(q >= p){	
			int mid = (p+q)/2;
			if(A[mid] == x){
				return mid;
			}
			else{
				if(x> A[mid]){
					return binarySearch(A, mid+1,q,x);
				}
				else{
					return binarySearch(A,p,mid-1,x);
				}
			}
		}
		return -1;
	}
	
	static int bin_search(int A[], int left, int right,  int k)
	{
		// This is the iterative implementation of binary search
		while(left <= right){
			int mid = (left+right)/2;
			if(A[mid] == k){
				return mid;
			}
			else if(A[mid] > k)
				right = mid -1;
			else
				left = mid +1;
		}
		return -1;
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] A = new int[n];

		for(int i = 0;i<n;i++){
			A[i] = in.nextInt();
		}
		//System.out.println("Number :");
		int x = in.nextInt();
		
		System.out.println(bin_search(A,0,n-1,x));
		
	}
}