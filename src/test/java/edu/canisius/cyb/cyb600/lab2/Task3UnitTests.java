package edu.canisius.cyb.cyb600.lab2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;




public class Task3UnitTests {
    private Task3 task3;

    @Before
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void setUp() {
        this.task3 = new Task3();
    }

    @Test
    public void test_removeDuplicates_best(){
        Task3 util = new Task3();

        String input = "aabbccdd";
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        ArrayList<String> actual = util.removeDuplicates(input);

        assertEquals(expected, actual, "The method did not remove the duplicates correctly.");
    }

    @Test
    public void test_removeDuplicates_average(){
        Task3 util = new Task3();

        String input = "aabbccdddddddabcdabcddb";
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        ArrayList<String> actual = util.removeDuplicates(input);

        assertEquals(expected, actual, "The method did not remove the duplicates correctly.");
    }

    @Test
    public void test_removeDuplicates_worst(){
        Task3 util = new Task3();

        String input = null;
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = util.removeDuplicates(input);

        assertEquals(expected, actual, "The method did not remove the duplicates correctly.");
    }

    @Test
    public void test_areTheseAnagrams_best(){
        Task3 util = new Task3();

        String str1 = "listen";
        String str2 = "silent";
        assertTrue("The method failed to correctly identify anagrams.",util.areTheseAnagrams(str1, str2));

    }

    @Test
    public void test_areTheseAnagrams_average(){
        Task3 util = new Task3();

        String str1 = "coolbeans";
        String str2 = "silent";
        assertFalse("The method failed to correctly identify non-anagrams.",util.areTheseAnagrams(str1, str2));

    }

    @Test
    public void test_areTheseAnagrams_worst(){
        Task3 util = new Task3();

        String str1 = null;
        String str2 = null;
        assertFalse("The method failed to correctly identify null strings.",util.areTheseAnagrams(str1, str2));

    }

}
