package com.csplusplus;

public class Unit8 {

    // 1. Method to calculate the sum of all elements in a 2D array
    // Instructions: Traverse the 2D array and calculate the sum of all elements.
    public static int sumOfElements(int[][] array) {
        // TODO: Implement this method
    	int sum= 0 ;
    	for (int i =0; i< array.length; i++) {
    		for (int j = 0; j < array[0].length; j++)
    		{
    			sum += array[i][j];
    		}
    	}
    	
        return sum;  // Placeholder return value
    }

    // 2. Method to count how many times a specific number appears in a 2D array
    // Instructions: Traverse the 2D array and count the number of times a specified value appears.
    public static int countOccurrences(int[][] array, int value) {
        // TODO: Implement this method
    	int cnt= 0 ;
    	for (int i =0; i< array.length; i++) {
    		for (int j = 0; j < array[0].length; j++)
    		{
    			if (array[i][j] == value) {
    				cnt ++;
    			}
    		}
    	}
    	
        return cnt;  // Placeholder return value
    }

    // 3. Method to find the maximum element in a 2D array
    // Instructions: Traverse the 2D array and find the maximum element.
    public static int findMax(int[][] array) {
        // TODO: Implement this 

    	int max= array[0][0] ;
    	for (int i =0; i< array.length; i++) {
    		for (int j = 0; j < array[0].length; j++)
    		{
    			if (array[i][j] > max) {
    				max = array[i][j];
    			}
    		}
    	}
        return max;  // Placeholder return value
    }

    // 4. Method to reverse the rows of the 2D array
    // Instructions: Reverse the rows of the 2D array (e.g., the first row becomes the last, etc.).
    public static void reverseRows(int[][] array) {
    	int [][] temp = new int[ array.length ][ array[0].length ];
    	
    	for (int i =0; i< array.length; i++) {
    		for (int j = 0; j < array[0].length; j++)
    		{
    			temp[i][j] = array[i][j];
    		}
    	}
    	
    	for (int i =0; i< array.length; i++) {
    		array[i] = temp[( array.length - i -1)];
    	}
    	
    	
    	
        // TODO: Implement this method
    }

    // 5. Method to transpose a 2D array (swap rows and columns)
    // Instructions: Create and return a new 2D array that is the transpose of the input array.
    public static int[][] transpose(int[][] array) {
        // TODO: Implement this method
    	int [][] temp = new int[ array[0].length ][ array.length ];
    	
    	for (int i =0; i< array.length; i++) {
    		for (int j = 0; j < array[0].length; j++)
    		{
    			temp[j][i] = array[i][j];
    		}
    	}
    	
    	
        return temp;  // Placeholder return value
    }

    // 6. Method to fill a 2D array with random integers
    // Instructions: Create a 2D array of size numRows x numCols and fill it with random integers between min and max.
    public static int[][] fillWithRandom(int min, int max, int numRows, int numCols) {
        // TODO: Implement this method
    	
    	int [][] array = new int[ numRows ][ numCols ];
    	
    	for (int i =0; i< array.length; i++) {
    		for (int j = 0; j < array[0].length; j++)
    		{
    			array[i][j] = (int) (Math.random()*(max-min)) + min;
    		}
    	}
    	
        return array;  // Placeholder return value
    }
}