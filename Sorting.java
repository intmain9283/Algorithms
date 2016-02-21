/**
 * @author Vincent Mann
 */

package Sorting;

/**
 * The class where all my sorting algorithms are stored
 * @author Vincent Mann v_mann92@yahoo.com
 * @version 1.0
 */
public class Sorting {
    /**
     * Sorting Algorithm that sorts an array of numbers by taking a number and
     * moving it to the left if the number to the left of it is lower
     * @param array the array that you will be sorting
     */
    public void insertionSort(int[] array) {
        int j;                                  //Integer for FOR loop
        
        // FOR loop that sorts the array
        for (j = 1; j < array.length; j++) {
            insert(array, j-1, array[j]);
        }
    }
    
    /**
     * Sorting algorithm that sorts an array by finding the lowest number and 
     * swapping it with lowest position in the array
     * @param array The array that you will be sorting
     */
    public void selectionSort(int[] array) {
        int minIndex;           /*
                                Integer for the index of the lowest number in
                                array
                                */
        
        //  FOR loop that sorts the array
        for (int i = 0; i < array.length; i++) {
            minIndex = indexOfMin(array, i);
            swap(array, minIndex, i);
        }
    }
    /**
     * Method that finds the index of the lowest number in the array
     * Used by {@link #selectionSort(int[] array)}
     * @param array The array you will be sorting
     * @param startIndex The index of the array you will be starting from
     * @return The index of where the lowest number of the array
     */
    private int indexOfMin(int[] array, int startIndex) {
        int minValue = array[startIndex];  //Where the lowest value is stored
        int minIndex = startIndex;         //The index of the lowest number
        
        //FOR loop that sorts the array
        for(int i = minIndex + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minIndex = i;
                minValue = array[i];
            }
        }
        //Returns the index of the lowest number
        return minIndex;
    }
    /**
     * Method that swaps two numbers.  Used by {@link #selectionSort(int[] array)}
     * @param array The array you will be sorting
     * @param firstIndex The index of the first number you will be swapping
     * @param secondIndex The index of the second number you will be swapping
     */
    private void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
    /**
     * Method that is used by {@link #insertionSort(int[] array)}
     * @param array The array you will be sorting
     * @param rightIndex 
     * @param value The number you are looking to insert
     */
    private void insert (int[] array, int rightIndex, int value) {
        int i;
        for (i = rightIndex; i >= 0 && array[i] > value; i--) {
            array[i + 1] = array[i];
        }
        
        array[i+1] = value;
    }
}
