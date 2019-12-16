package arraySorter;

import arrayGenerator.ArrayGenerator;
import arrayGenerator.IntegerArrayGenerator;
import scope.IntegerScope;

/**
 * Tests selection sort for integer arrays.
 *
 * @author Max Osborne
 */
public class IntegerSelectionSortTest extends SelectionSortTest<Integer> {
    @Override
    ArrayGenerator<Integer> getGenerator() {
        return new IntegerArrayGenerator(new IntegerScope());
    }
}