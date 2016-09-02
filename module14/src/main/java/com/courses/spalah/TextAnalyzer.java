package com.courses.spalah;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

/**
 * @author Ievgen Tararaka
 */
public class TextAnalyzer {
    public static void main(String[] args) {
        System.out.println(readLines());
    }

    public static List<String> readLines() {
        try {
            return Files.readAllLines(Paths.get(ClassLoader.getSystemResource("text_sample.txt").toURI()));
        } catch (IOException | URISyntaxException e) {
            System.out.println("OOPS, cannot read file");
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
