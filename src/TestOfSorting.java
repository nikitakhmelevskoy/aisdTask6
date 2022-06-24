import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TestOfSorting {
    private final int[] inputArr;
    private final int[] expectedArr;

    public TestOfSorting(int[] inputArr, int[] expectedArr) {
        this.inputArr = inputArr;
        this.expectedArr = expectedArr;
    }

    @Parameterized.Parameters
    public static List<Object[]> cases() {
        return Arrays.asList(new Object[][]{
                {new int[]{4, 1, 3, 4, 2, 6, 9, 8, 7}, new int[]{4, 1, 3, 4, 2, 6, 9, 8, 7}},
                {new int[]{0, -1, -2}, new int[]{0, -1, -2}},
                {new int[]{2, 4, 6, 8, 10, 12, 13, -2}, new int[]{2, 4, 6, 8, 10, 12, 13, -2}},
        });
    }

    @Test
    public void sortArrTest() {
        int[] actualResult = Main.sortArr(inputArr);
        Assert.assertEquals(Arrays.toString(expectedArr), Arrays.toString(actualResult));
    }
}