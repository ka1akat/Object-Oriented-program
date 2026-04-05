package pr5.task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class WordFrequencyReport {
    public static void main(String[] args) {
        Map<String, Integer> wordCounts = new HashMap<>();

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream("src/pr5/task2/input.txt"), StandardCharsets.UTF_8)
            );
            PrintWriter writer = new PrintWriter(
                new OutputStreamWriter(new FileOutputStream("src/pr5/task2/report.txt"), StandardCharsets.UTF_8)
            )
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase();
                line = line.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", " ");

                String[] words = line.split("\\s+");
                
                for(String word: words) {
                	if(!word.isEmpty()) {
                		wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                	}
                }
            }

            List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCounts.entrySet());

            list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
            
            for(Map.Entry<String, Integer> entry : list) {
            	writer.println(entry.getKey() + " " + entry.getValue());
            }

            System.out.println("Report has been written to report.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
