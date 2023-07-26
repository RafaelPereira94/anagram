package pt.rafael

import pt.rafael.util.AnagramValidator
import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    println("Insert first text:")
    val text1 = input.nextLine()
    println("Insert second text:")
    val text2 = input.nextLine()

    try {
        val result: Boolean = AnagramValidator.areAnagrams(text1, text2)
        if (result) {
            println("$text1 and $text2 are anagrams")
        } else {
            println("$text1 and $text2 are not anagrams")
        }
    } catch (npe: NullPointerException) {
        println("One of your texts is invalid, please try again!")
    }
}