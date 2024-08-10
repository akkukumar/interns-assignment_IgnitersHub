

import java.util.Scanner;
import java.io.*;

 class Challenge4 {


    public static void main(String[] args) {
    	
        // Input sentence
       // String sentence = "The quick brown fox";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The sentence");
        String str =sc.nextLine();
        
        
        // 1. Count the number of words in the sentence
        String[] words = str.split(" ");
        int wordCount = words.length; 
        System.out.println("Number of words: " + wordCount);
        
        // 2. Reverse the order of words in the sentence
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }
        System.out.println("Reversed sentence: " + reversedSentence.toString());
        
        // 3. Replace all spaces with hyphens ('-') Modified sentence:
        String sentenceWithHyphens = str.replace(' ', '-');
        System.out.println("Modified sentence: " + sentenceWithHyphens);
    }
}
