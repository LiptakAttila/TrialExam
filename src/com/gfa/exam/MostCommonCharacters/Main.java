package com.gfa.exam.MostCommonCharacters;

import java.io.IOException;

import static com.gfa.exam.MostCommonCharacters.MostCommonCharacters.getTwoMostCommonCharacters;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Dell\\OneDrive\\Bureaublad\\TrialExam\\exam-trial-basics\\countchar.txt";
        getTwoMostCommonCharacters(fileName);
    }
}
