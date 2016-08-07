package hackerrank;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.lang.reflect.Array;

public class arrayRowWiseSort {
	
	public static void main( String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("enter no. of rows");
		int m=in.nextInt();
		System.out.println("Enter no. of columns");
		int n=in.nextInt();
		
		int[][] arr=new int[m][n];
		System.out.println("enter the elements");
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=in.nextInt();
			}
		}
		Integer[] arrnew=new Integer[n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arrnew[j]=arr[i][j];	
			}
			
			Arrays.sort(arrnew);
			for(int k=0;k<n;k++){
				
			
				System.out.print(arrnew[k]+"\t");
				
			}
			
			System.out.println();
		}
		
		}
		
	}


