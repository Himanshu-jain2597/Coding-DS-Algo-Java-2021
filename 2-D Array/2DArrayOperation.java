// 2-D just means array of arrays i.e one D array point array 

/*
if we initalise with this way 
int [][] arr  = new int[][3] // this things is not possible compilation error. cannot specify an array dimension after an empty dimension
int [][] arr = new int[3][] // only one d is created at two point and which have values null.
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [][] arr = takeInput();
		display(arr);
	}
	private static int[][] takeInput() {
	    Scanner sc = new Scanner(System.in);
	    int rows = sc.nextInt();
	    int [][] arr = new int[rows][];
	    for(int i=0;i<rows;i++) {
	        int cols = sc.nextInt();
	        arr[i] = new int[cols];
	        for(int j=0;j<arr[i].length;j++) {
	            arr[i][j] = sc.nextInt();
	        }
	    }
	    return arr;
	}
	private static void display(int[][] arr) {
	    for(int i=0;i<arr.length;i++) {
	        for(int j=0;j<arr[i].length;j++) {
	            System.out.println(arr[i][j]);	        
	            
	        }
	    }
	}
    }
