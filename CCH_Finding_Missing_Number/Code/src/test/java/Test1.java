import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class Test1 {

    @Test
    public void sort() {
        Occurance calculator = new Occurance();
        char[] bubblesort = calculator.bubblesort(new char[]{5, 7, 3, 9});
        assertArrayEquals(bubblesort,new char[]{3, 5, 7, 9});
        System.out.println("Test Is Passed");
    }
}
