package arraySorter;

import arrayGenerator.ArrayGenerator;
import arrayGenerator.CharacterArrayGenerator;

/**
 * Tests selection sort for character arrays.
 *
 * @author Max Wright
 */
public class CharacterSelectionSortTest extends SelectionSortTest<Character> {
    @Override
    ArrayGenerator<Character> getGenerator() {
        return new CharacterArrayGenerator();
    }
}
