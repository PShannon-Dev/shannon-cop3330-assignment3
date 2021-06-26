package ex42;

import ex41.FileManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ChartTest {
    @Test
    void parsing_string_to_int() {
        ArrayList<String> testArray = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            testArray.add("Str");
        }
        Chart myChart = new Chart(testArray);

        assertEquals(8, myChart.parse_salary("8"));
    }

    @Test
    void separate_string_by_commas() {
        ArrayList<String> testArray = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            testArray.add("1,");
        }
        Chart myChart = new Chart(testArray);
        String[] arr = myChart.split_string(myChart.getInputStrings());
        String test = arr.toString();

        assertEquals("11111111", test);
    }
}