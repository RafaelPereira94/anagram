package pt.rafael.util;

import java.util.HashMap;
import java.util.Map;

/**
 * The AnagramChecker class provides a utility method to check if two texts are anagrams of each other.
 * Anagrams are words or phrases formed by rearranging the letters of another word or phrase.
 * The comparison is case-insensitive, considering both texts in lowercase.
 *
 * @author [Rafael]
 * @version 1.0
 * @since [26/07/2023]
 */
public class AnagramChecker {

    /**
     * Checks if two texts are anagrams of each other.
     * Anagrams are words or phrases formed by rearranging the letters of another word or phrase.
     * The comparison is case-insensitive, considering both texts in lowercase.
     *
     * @param text1 The first text to check for anagrams.
     * @param text2 The second text to check for anagrams.
     * @return {@code true} if the two texts are anagrams; {@code false} otherwise.
     * @throws NullPointerException If either {@code text1} or {@code text2} is {@code null}.
     */
    public static boolean areAnagrams(String text1, String text2) {

        if (text1.length() != text2.length()) {
            return false;
        }

        String text1ToLowercase = text1.toLowerCase();
        String text2ToLowercase = text2.toLowerCase();

        Map<Character, Integer> letterCount = new HashMap<>();

        for (char c : text1ToLowercase.toCharArray()) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }

        for (char c : text2ToLowercase.toCharArray()) {
            int value = letterCount.getOrDefault(c, 0);
            if (value == 0) { //letter doesn't match any of the word from text1, so they are not anagrams.
                return false;
            }
            letterCount.put(c, value - 1);
        }

        return true;
    }
}
