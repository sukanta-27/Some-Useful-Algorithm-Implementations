import java.util.*;
import java.io.*;

class InsertionSort{
	public static void insertionSort(int[] arr, int n){
		for(int i =0;i<n;i++){
			for(int j = 0;j<i;j++){
				if(arr[i] < arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
	}
	
	public static void main(String a[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++){
			arr[i] = in.nextInt();
		}
		insertionSort(arr,n);
		
		for(int i : arr){
			System.out.print(i+" ");
		}
	}
}