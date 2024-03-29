package arraySorter;

import timer.Timer;

/**
 * Base implementation for selection sort timers.
 *
 * @param <T> the type of object sorted by the bubble sort to be timed.
 *
 * @author Max Wright
 */
public abstract class SelectionSortTimer<T extends Comparable<? super T>> extends SelectionSort<T> implements Timer {

    private T[] array; // this is the array that will be sorted

    void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public void timedMethod() {
        sort(array);
    }

    @Override
    public long getMaximumRuntime() {
        return Long.MAX_VALUE;
    }

    @Override
    public int getMinimumTaskSize() {
        return 1;
    }

    @Override
    public int getMaximumTaskSize() {
        return 100000;
    }

    @Override
    public int getRunSetSize() {
        return 100;
    }
}