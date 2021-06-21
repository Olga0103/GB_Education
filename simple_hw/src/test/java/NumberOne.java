import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.gb.datas_for_tests.Main;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class NumberOne {

    private int[] arrayWithout4;
    @Before
    public void testOnException (){
        arrayWithout4 = new int[]{1,2,3};
    }

    Main arr1 = new Main();
    @Test(expected = RuntimeException.class)
    public void testArrException(){
        arr1.numberOne(arrayWithout4);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        System.out.println("test");
        return Arrays.asList(new Object[][]{
                {new int []{1, 1, 4}, new int []{}},
                {new int []{1, 1, 4, 4},new int []{}},
                {new int []{1, 2, 3, 4, 5}, new int []{5}},
                {new int []{1, 2, 3, 4, 5, 6, 7}, new int []{5, 6, 7}},
        });
    }

    private int[] arrIn;
    private int[] arrOut;

    public NumberOne(int[] arrIn, int[] arrOut) {
        this.arrIn = arrIn;
        this.arrOut = arrOut;
    }

    Main arr2 = new Main();

    @Test
    public void number1Test() {
        Assert.assertArrayEquals(arrOut, arr2.numberOne(arrIn));
    }

}
