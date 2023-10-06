package com.gfa.exam.MostCommonCharacters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class MostCommonCharacters {

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Dell\\OneDrive\\Bureaublad\\TrialExam\\exam-trial-basics\\countchar.txt";
        getTwoMostCommonCharacters(fileName);
    }

    public static HashMap<Character, Integer> getTwoMostCommonCharacters(String fileName) throws IOException {
        HashMap<Character, Integer> countCharsMap = new HashMap<>();
        Path filePath = Paths.get(fileName);
        List<String> fileLines;
        try {
            fileLines = Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new IOException("File does not exist!");
        }
        for (String line : fileLines) {
            line = line.replace(" ", "").toLowerCase();
            for (int i = 0; i < line.length(); i++) {
                countCharsMap.put(line.charAt(i), countCharsMap.getOrDefault(line.charAt(i), 0) + 1);
            }
        }

        int maxOccurence = 0;
        char maxOccurenceChar = ' ';
        int secondMaxOccurence = 0;
        char secondMaxOccurenceChar = ' ';
        for (char key : countCharsMap.keySet()) {
            if (countCharsMap.get(key) > maxOccurence) {
                maxOccurence = countCharsMap.get(key);
                maxOccurenceChar = key;
            }
            if (countCharsMap.get(key) > secondMaxOccurence && maxOccurenceChar != key) {
                secondMaxOccurence = countCharsMap.get(key);
                secondMaxOccurenceChar = key;
            }
        }
        HashMap<Character, Integer> mostUsedCharsMap = new HashMap<>();
        mostUsedCharsMap.put(maxOccurenceChar, maxOccurence);
        mostUsedCharsMap.put(secondMaxOccurenceChar, secondMaxOccurence);

        return mostUsedCharsMap;
    }
}
