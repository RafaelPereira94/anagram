import org.junit.jupiter.api.Test;
import pt.rafael.util.AnagramChecker;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramCheckerTest {

    @Test
    public void testTwoTextsAreAnagrams() {
        String text1 = "i like dogs";
        String text2 = "doek lig is";

        boolean result = AnagramChecker.areAnagrams(text1, text2);
        assertTrue(result);
    }

    @Test
    public void testTwoTextsAreNotAnagramsTest() {
        String text1 = "i like cats";
        String text2 = "cat limes i";

        boolean result = AnagramChecker.areAnagrams(text1, text2);
        assertFalse(result);
    }

    @Test
    public void testDifferentLengthTexts() {
        String text1 = "testing";
        String text2 = "testin";

        boolean result = AnagramChecker.areAnagrams(text1, text2);
        assertFalse(result);
    }

    @Test
    public void testTwoWordsAreAnagrams() {
        String text1 = "Listen";
        String text2 = "Silent";

        boolean result = AnagramChecker.areAnagrams(text1, text2);
        assertTrue(result);
    }

    @Test
    public void testTwoWordsAreNotAnagrams() {
        String text1 = "Listen";
        String text2 = "Driven";

        boolean result = AnagramChecker.areAnagrams(text1, text2);
        assertFalse(result);
    }

    @Test
    public void testOneTextIsBlankTest() {
        String text1 = "facts";
        String text2 = "";

        boolean result = AnagramChecker.areAnagrams(text1, text2);
        assertFalse(result);
    }

    @Test
    public void testOneTextIsNullShouldThrowException() {
        assertThrows(NullPointerException.class, () -> {
            AnagramChecker.areAnagrams(null, "soul");
        });
    }

}
