package Interview_ques;						//SC=O(1)		TC=O(n)

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Countletters_Words {

    public static void main(String[] args) {
        String filename = "file.txt"; //  path of file
        int letterCount = 0;
        int wordCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = reader.readLine()) != null) {
                letterCount += countLetters(line);
                wordCount += countWords(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of words: " + wordCount);
    }

    private static int countLetters(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    private static int countWords(String input) {
        String[] words = input.trim().split("\\s+");
        return words.length;
    }
}
