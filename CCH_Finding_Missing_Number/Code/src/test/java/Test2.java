import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class Test2 {


    @Test
    public void sort() {
        MissingNumber missingnumber = new MissingNumber();
        int[] i = missingnumber.bubbleSort(new int[]{5, 7, 3, 9});

        int[] intArray = new int[] {3,5,7,9};
        assertArrayEquals(i,intArray);
        System.out.println("Test Is Passed");

    }

    @Test
    public void missingnum() {
        MissingNumber missingnumber = new MissingNumber();
        int[] missingnumber1 = missingnumber.missingnumber(new int[]{3, 5, 6, 7}, 4);
        assertArrayEquals(missingnumber1,new int[]{4});
        System.out.println("Test Is Passed2");

    }

}
