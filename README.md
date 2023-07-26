# Anagram Checker

This project contains the implementation of an anagram checker for words and texts.

In Java and kotlin.

# Requirements:
- Java 17
- Maven

## Cloning the Project

To clone this project, use the following command in your terminal or command prompt:

git clone https://github.com/RafaelPereira94/anagram.git

## Running the Main Functions Separately

### 1. Java Main Function (Main.java)

To run the Java Main function, use the following Maven command in your terminal or command prompt:

`mvn compile exec:java -Dexec.mainClass=pt.rafael.Main`

### 2. Kotlin Main Function (Main.kt)

To run the Kotlin Main function, use the following Maven command in your terminal or command prompt:

`mvn compile exec:java -Dexec.mainClass=pt.rafael.MainKt`

## Building the Project

To build the entire project and create the target artifacts (JAR files), use the following Maven command in your terminal or command prompt:

`mvn clean package`

This command will compile both Kotlin and Java sources, run the tests, and package the project. The built JAR files will be located in the `target` directory.

## Running Tests

To execute the tests for both Kotlin and Java, use the following Maven command in your terminal or command prompt:

`mvn test`


## Future work that could be done:

In our algorithm instead of using a `Map<Character, Integer>` we could use the guava data structure
`Multiset<T>` that can be used to count the occurrences of elements in a collection.
