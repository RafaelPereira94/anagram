import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import pt.rafael.util.AnagramValidator

class AnagramValidatorTest {
    @Test
    fun testTwoTextsAreAnagrams() {
        val text1 = "i like dogs"
        val text2 = "doek lig is"
        val result = AnagramValidator.areAnagrams(text1, text2)
        Assertions.assertTrue(result)
    }

    @Test
    fun testTwoTextsAreNotAnagramsTest() {
        val text1 = "i like cats"
        val text2 = "cat limes i"
        val result = AnagramValidator.areAnagrams(text1, text2)
        Assertions.assertFalse(result)
    }

    @Test
    fun testDifferentLengthTexts() {
        val text1 = "testing"
        val text2 = "testin"
        val result = AnagramValidator.areAnagrams(text1, text2)
        Assertions.assertFalse(result)
    }

    @Test
    fun testTwoWordsAreAnagrams() {
        val text1 = "Listen"
        val text2 = "Silent"
        val result = AnagramValidator.areAnagrams(text1, text2)
        Assertions.assertTrue(result)
    }

    @Test
    fun testTwoWordsAreNotAnagrams() {
        val text1 = "Listen"
        val text2 = "Driven"
        val result = AnagramValidator.areAnagrams(text1, text2)
        Assertions.assertFalse(result)
    }

    @Test
    fun testOneTextIsBlankTest() {
        val text1 = "facts"
        val text2 = ""
        val result = AnagramValidator.areAnagrams(text1, text2)
        Assertions.assertFalse(result)
    }

    //Since kotlin provides null safety out of the box
    //Because we are using non-null types if we want nulls
    //Nullable types are declared by explicitly adding ? after the type declaration.
    /*@Test
    fun testOneTextIsNullShouldThrowException() {
        Assertions.assertThrows(
            NullPointerException::class.java
        ) { AnagramValidator.areAnagrams(null!!, "soul") }
    }*/
}