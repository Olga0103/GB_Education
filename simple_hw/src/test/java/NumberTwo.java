import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.gb.datas_for_tests.Main;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class NumberTwo {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        System.out.println("test");
        return Arrays.asList(new Object[][]{
                {new int []{4, 1, 4}, true},
                {new int []{1, 4, 4, 1, 1},true},
                {new int []{1, 7, 3, 4, 0}, false},
                {new int []{1, 1}, false},
                {new int []{4, 4, 4, 4}, false},
        });
    }

    private int[] arr;
    private boolean result;

    public NumberTwo(int[] arr, boolean result) {
        this.arr = arr;
        this.result = result;
    }

    Main arr2 = new Main();

    @Test
    public void task2Test() {
        Assert.assertEquals(result, arr2.numberTwo(arr));
    }
}
