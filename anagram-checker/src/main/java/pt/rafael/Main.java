package pt.rafael;

import pt.rafael.util.AnagramChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insert first text:");
        String text1 = input.nextLine();
        System.out.println("Insert second text:");
        String text2 = input.nextLine();

        try{
            var result = AnagramChecker.areAnagrams(text1, text2);
            if(result) {
                System.out.println(text1 + " and " + text2 + " are anagrams");
            }else {
                System.out.println(text1 + " and " + text2 + " are not anagrams");
            }
        }catch (NullPointerException npe) {
            System.out.println("One of your texts is invalid, please try again!");
        }
    }
}