package arraySorter;
/**
 * Implementation of a selection sort algorithm
 * Using generics and comparables
 * @author Jay Taylor
 * @version 2019
 */
public class SelectionSort<T extends Comparable<? super T>> implements ArraySort<T> {
    /**
     * Sorts a given array using the selection sort algorithm
     * @param array the initial unsorted
     * @return the updated sorted array

     * <ul>
     *     <li> For every index in the array </li>
     *     <li> Loop through the rest of the array to find the smallest</li>
     *     <li> Then swap that current index with the smallest</li>
     *     <li> return the sorted array</li>
     * </ul>
     */
    public T[] sort(T[] array) {
        //For every index in the array
        for(int i=0; i<array.length -1; i++)
        {
            int CurrentSmallestIndex = i; //Create a smallest index variable
            //For every index after the smallest index
            for(int j=i+1; j<array.length; j++)
            {
                //if the index is smaller that the current smallest set it as  the new smallest

                if(array[CurrentSmallestIndex].compareTo((array[j])) > 0  )
                {
                    CurrentSmallestIndex = j;
                }
            }
            //Create a temp variable to swap the indices
            T temp = array[CurrentSmallestIndex];
            //Swap the current smallest with the the first of the unsorted
            array[CurrentSmallestIndex] = array[i];
            array[i] = temp;
        }
        return array; //returns the sorted array
    }
}