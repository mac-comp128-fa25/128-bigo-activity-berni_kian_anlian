package orderNotationActivity;

import java.util.Random;
import java.util.Arrays;

// Activity Readme can be found here:
// https://docs.google.com/document/d/1UTI-1HLoBwvOo67ZwsHYjArW6qgxBYbsyiaDNri2tA0/edit?usp=sharing

public class BigODrill {

    /**
     * (1)
     * Demonstrates an algorithm with a constant run time, O(1)
     * @param numArr - an int array numArr
     * @return the last element of the array numArr
     */
    public static int constantTime(int[] numArr) {
        return numArr[numArr.length - 1]; 
    }


    /**
     * (2)
     * Demonstrates an algorithm with a linear run time, O(n)
     * @param numArr - an integer array
     * @return the input array where each element of the array is multiplied with itself
     */
    public static int[] linearTime(int[] numArr) {
        
        for (int i = 0; i < numArr.length; i++){
            numArr[i] *= numArr[i]; //just taking each element at index i and squaring it
        }
        return numArr;
    }

    /**
     * (3)
     * Demonstrates an algorithm with a logarithmic run time, O(n log n). 
     * We have a coefficient of n because the size of the input array 
     * would affect how long the halving operation (which tells us in
     * the begining it might be O(log n)
     * 
     * @param numArr - an integer array
     */
    public static int[] puzzle03(int[] numArr) {
        //This method halves the size of the input array by copying it into a new array and skipping indices between every i * 2. For example {9,5,3,1,7,8,2,1,5,5} -> {5,3,7,5}
        //we start at index 1 so we can actually double index 
        int index2 = 0; //accumulator index used to populate tempArr. The first element of the new array is the second element of the input array (b/c if we initialized at 0.. 0*2 = 0 forever)
        int[] tempArr = new int[numArr.length]; //new array w/ same  length as input array
        for(int index = 1; index < numArr.length; index = index * 2) { //loop from second element to end, increment by 2i (so O(log n))
            tempArr[index2] = numArr[index]; 
            index2++;
        }
        return tempArr;
    }

    /**
     * (4)
     * Demonstrates an algorithm with a quadratic run time, O(n^2)
     * @param numArr -  a two dimensional rectangular integer array a.k.a 2D matrix
     * @return a double that represents the sparsity of numArr
     */
    public static double sparsity(int[][] numArr) {
        //TODO: Write the code that calculates and returns the sparsity of the input
        // rectangular integer array numArr
        double zeroElements = 0;
        
        for (int i = 0; i < numArr.length; i++){
            for (int j = 0; j < numArr[i].length; j++){ //Saw this is a way to loop through 2D Arrays on a YouTube video?
                if (numArr[i][j] == 0) {
                    // System.err.println(numArr[i][j]);
                    
                    zeroElements++; // looping through n elements i and j times.. so O(n^2)
                    // System.err.println(zeroElements);
                    // System.err.println(numArr.length * numArr[0].length);
                }
            }
        }
       
        return ((zeroElements) / (numArr.length * numArr[0].length)); // # columns * # entries in column
    }

    /**
     * (5)
     * Demonstrates an algorithm with TODO: What is the O( ? ) of the following code?
     * @param numArr - two dimensional rectangular integer array a.k.a 2D matrix
     * @param sparsityValue - 0.0-1.0 representing sparsity to make the matrix.
     * @return - numArray overwritten as a sparse matrix with a sparsity of sparsityValue
     */
    public static int[][] sparseMatrix(int[][] numArr, double sparsityValue) {
        assert(sparsityValue >= 0.0 && sparsityValue <= 1.0);
        Random randGenerator = new Random();

        //TODO: Write the code to overwrite the numArr such that it is a sparse matrix
        // with a sparsity of %75

        return numArr;
    }


    public static void main (String[] args){
        int[] testArray = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println(constantTime(testArray)); //returns 10, this method works
        
        System.out.println(Arrays.toString(linearTime(testArray))); //squares each number now, this one works too. Also we need to use toString b/c otherwise it prints the address
        
        System.out.println(Arrays.toString(puzzle03(testArray))); //starts from index 1 and returns half the elements (in steps of i * 2). once i = 8 there's no more elements we can grab b/c i = 16 is outside of our array.

        int[][] nestedArray = {{1,2,3},{0,0,0},{1,2,4}}; //syntax for just instantiating a 2D array in one line

        System.out.println(sparsity(nestedArray)); //works
    }
}
