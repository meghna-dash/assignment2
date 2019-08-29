import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class FinderTest {
    Finder tester = new Finder();
    int[] validArray = {2, 1, 3, 5, 4};
    int[] nullArray = null;
    int[] emptyArray ={};

    @org.junit.jupiter.api.Test
    void getMaxInArray() {
        assertThat(tester.getMaxInArray(validArray), is(equalTo(5)));
        assertNull(tester.getMaxInArray(nullArray));
        assertNull(tester.getMaxInArray(emptyArray));
    }

    @org.junit.jupiter.api.Test
    void getMinInArray() {
        assertThat(tester.getMinInArray(validArray), is(equalTo(1)));
        assertNull(tester.getMinInArray(nullArray));
        assertNull(tester.getMinInArray(emptyArray));
    }
}