package orderNotationActivity;

import java.util.Random;

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
        //TODO: Add the code that returns the last element of the input array with O(1) run time
        return numArr[numArr.length - 1]; // Placeholder to make it compile. Replace me with the correct value.
    }


    /**
     * (2)
     * Demonstrates an algorithm with a linear run time, O(n)
     * @param numArr - an integer array
     * @return the input array where each element of the array is multiplied with itself
     */
    public static int[] linearTime(int[] numArr) {
        //TODO: Add the code to modify and return the input array with each element squared
        // which performs in O(n)

        for (element : numArr){
            numArr[element] = element * element;
        }

        return numArr;
    }

    /**
     * (3)
     * Demonstrates an algorithm with TODO: What is O( ? ) of the following code?
     * @param numArr - an integer array
     */
    public static int[] puzzle03(int[] numArr) {
        //TODO: What does the following code do?
        int index2 = 0;
        int[] tempArr = new int[numArr.length];
        for(int index = 1; index < numArr.length; index = index * 2) {
            tempArr[index2] = numArr[index];
            index2++;
        }
        return tempArr;
    }

    /**
     * (4)
     * Demonstrates an algorithm with TODO: What is the O( ? ) of the following code?
     * @param numArr -  a two dimensional rectangular integer array a.k.a 2D matrix
     * @return a double that represents the sparsity of numArr
     */
    public static double sparsity(int[][] numArr) {
        //TODO: Write the code that calculates and returns the sparsity of the input
        // rectangular integer array numArr
        return 0; // Placeholder to make it compile.

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
        //TODO: Write code to run your methods

    }
}
