package testAuto;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {

    @Test
    public void testSearchOnlyOneAndFour() {
        int[] input1 = {1, 1, 1, 4, 4, 1, 4, 4};
        assertTrue(ArrayUtils.searchOnlyOneAndFour(input1));
        int[] input2 = new int[]{1, 1, 1, 1, 1, 1, 1};
        assertFalse(ArrayUtils.searchOnlyOneAndFour(input2));
        int[] input3= new int[]{4,4,4,4,4,4,4};
        assertFalse(ArrayUtils.searchOnlyOneAndFour(input3));
        int[] input4 = new int[]{1,4,1,1,4,4,3};
        assertFalse(ArrayUtils.searchOnlyOneAndFour(input4));
    }


    @Test
    public void testAfterLastFour_NormalCase() {
        int[] input = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] expected = {1, 7};
        assertArrayEquals(expected, ArrayUtils.afterLastFour(input));
    }


    @Test
    public void testAfterLastFour_OneFourAtEnd() {
        int[] input = {0, 4, 1, 2, 3, 4};
        int[] expected = {};
        assertArrayEquals(expected, ArrayUtils.afterLastFour(input));
    }


    @Test
    public void testAfterLastFour_OneFourInMiddle() {
        int[] input = {9, 8, 7, 4, 6, 5};
        int[] expected = {6, 5};
        assertArrayEquals(expected, ArrayUtils.afterLastFour(input));
    }


    @Test
    public void testAfterLastFour_NoFour_ExceptionThrown() {
        int[] input = {1, 2, 3, 5};
        assertThrows(RuntimeException.class, () -> ArrayUtils.afterLastFour(input));
    }

    @Test
    public void testAfterLastFour_IsEmpty_ExceptionThrown() {
        int[] input = {};
        assertThrows(RuntimeException.class, () -> ArrayUtils.afterLastFour(input));
    }
}

