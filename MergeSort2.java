import java.util.*;
import java.io.*;

public class MergeSort2{
	static void merge(int[] A, int p,int mid,int q){
		int n1 = mid - p +1;
		int n2 = q - mid;
		int[] B = new int[n1];
		int[] C = new int[n2];
		
		for(int i = 0;i<n1;i++){
			B[i] = A[i+p];
			
		}
		
		for(int i = 0;i <n2;i++){
			C[i] = A[i + mid+ 1];
		}
		
		int i = 0,j=0,k = p;
		while(i<n1 && j<n2){
			if(B[i] <= C[j]){
				A[k] = B[i];
				i++;
				k++;
			}
			else{
				A[k] = C[j];
				j++;
				k++;
			}
		}
		
		while(i<n1){
			A[k] = B[i];
			i++;
			k++;
		}
		
		while(j <n2){
			A[k] = C[j];
			j++;
			k++;
		}
		
	}
	static void mergeSort(int[] A,int p,int q){
		int mid = (p+q)/2;
		
		if(p < q){
			mergeSort(A, p, mid);
			mergeSort(A,mid+1,q);
			merge(A,p,mid,q);
		}
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] A = new int[n];
		for(int i = 0;i<n;i++){
			A[i] = in.nextInt();
		}
		mergeSort(A,0,n-1);
		for(int i: A){
			System.out.println(i);
		}
	}
}