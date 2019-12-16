package arraySorter;

import arrayGenerator.ArrayGenerator;
import arrayGenerator.CharacterArrayGenerator;

/**
 * Tests selection sort for character arrays.
 *
 * @author Max Wright
 */
public class CharacterQuickSortTest extends QuickSortTest<Character> {
    @Override
    ArrayGenerator<Character> getGenerator() {
        return new CharacterArrayGenerator();
    }
}
