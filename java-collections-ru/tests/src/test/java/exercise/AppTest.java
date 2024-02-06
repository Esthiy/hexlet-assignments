package exercise;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        var count = 2;
        var expected = numbers.subList(0, count);
        var actual = App.take(numbers, count);
        assertThat(expected).isEqualTo(actual);
        // END
    }

    @Test
    void testTakeWithEmptyList() {
        // BEGIN
        List<Integer> numbers = emptyList();
        var count = 2;
        var expected = emptyList();
        var actual = App.take(numbers, count);
        assertThat(expected).isEqualTo(actual);
        // END
    }

    @Test
    void testTakeWithCountBiggerThanSize() {
        // BEGIN
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        var count = numbers.size() + 1;
        var actual = App.take(numbers, count);
        assertThat(numbers).isEqualTo(actual);
        // END
    }

    @Test
    void testTakeWithZeroCount() {
        // BEGIN
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        var count = 0;
        var expected = emptyList();
        var actual = App.take(numbers, count);
        assertThat(expected).isEqualTo(actual);
        // END
    }

    @Test
    void testTakeWithNegativeCount() {
        // BEGIN
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        var count = -1;
        var expected = emptyList();
        var actual = App.take(numbers, count);
        assertThat(expected).isEqualTo(actual);
        // END
    }
}
