package arraySorter;
/**
 * Implementation of a quick sort algorithm
 * Using generics and comparables
 * @author Jay Taylor
 * @version 2019
 */
public class QuickSort<T extends Comparable<? super T>> implements ArraySort<T> {
    /**
     * Sorts a given array using the quick sort algorithm
     * @param array the initial unsorted
     * @return the updated sorted array
     * <ul>
     *     <li> Set the first and last index variables </li>
     *     <li> call quicksort using them variables and the array</li>
     *     <li> get the middle element to be the pivot</li>
     *     <li> anything on the LHS that is larger than the pivot swap it</li>
     *     <li> anything on the RHS that is smaller than the pivot swap it</li>
     *     <li> Recursively call quicksort on each side of the pivot until the list is sorted</li>
     *     <li> return the sorted list</li>
     * </ul>
     */
    public T[] sort(T[] array) {
        //Creates a variable set to the first index of the array
        int low = 0;
        //Creates a variable set to the last index of the array
        int high = array.length - 1;
        quickSort(array, low, high); //Calls the recursive quicksort algorithm with the given bounds
        return array; //Return the sorted array
    }
    private void quickSort(T[] arr, int First, int Last) {
        if (First < Last) {
            //Set two new variables as pointers
            int i = First;
            int j = Last;
            //Gets the pivot
            T x = arr[(i + j) / 2];
            do {
                //if the current value in the left list is smaller than the pivot, increment pointer
                while (arr[i].compareTo(x) < 0){
                    i++;
                }
                //if the current value in the right list is greater than the pivot, decrement pointer
                while (x.compareTo(arr[j]) < 0){
                    j--;
                }
                //If we have found two values that need swapping
                if ( i <= j) {
                    //Create a temp variable equal to the i index that needs swapping
                    T temp = arr[i];
                    //set the value at index i to be equal to the value at index j
                    arr[i] = arr[j];
                    //set the value at index j to be equal to the temp variable
                    arr[j] = temp;
                    i++;
                    j--;
                }
            } while (i <= j);
            //call the quicksort algorithm again for the LHS of the pivot
            quickSort(arr, First, j);
            //call the quicksort algorithm again for the RHS of the pivot
            quickSort(arr, i, Last);
        }
    }
}

