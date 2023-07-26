package pt.rafael.util

import java.util.*

/**
 * The AnagramValidator class provides a utility method to check if two texts are anagrams of each other.
 * Anagrams are words or phrases formed by rearranging the letters of another word or phrase.
 * The comparison is case-insensitive, considering both texts in lowercase.
 *
 * @author [Rafael]
 * @version 1.0
 * @since [26/07/2023]
 */
class AnagramValidator {

    companion object {
        fun areAnagrams(text1: String, text2: String): Boolean {

            if (text1.length != text2.length) {
                return false
            }
            val text1ToLowercase = text1.lowercase(Locale.getDefault())
            val text2ToLowercase = text2.lowercase(Locale.getDefault())

            val letterCount: MutableMap<Char, Int> = HashMap()

            text1ToLowercase.toCharArray().forEach {
                letterCount[it] = letterCount.getOrDefault(it, 0) + 1
            }

            text2ToLowercase.toCharArray().forEach {
                val value = letterCount.getOrDefault(it, 0)
                if (value == 0) {
                    return false
                }
                letterCount[it] = value - 1
            }

            return true
        }
    }
}
