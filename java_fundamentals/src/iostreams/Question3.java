package iostreams;

import java.io.*;
import java.util.*;

public class Question3 {

    public static void main(String[] args) {
        Map<String, Integer> wordCountMap = new TreeMap<>(); // TreeMap keeps entries sorted

        try (BufferedReader reader = new BufferedReader(new FileReader("src/iostreams/input1.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src/iostreams/output1.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Split line into words, handling multiple spaces and punctuation
                String[] words = line.split("\\s+");

                for (String word : words) {
                    word = word.trim();
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Write word frequencies to output file
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }

            System.out.println("Word frequencies written to output1.txt");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}