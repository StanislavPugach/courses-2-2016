package com.courses.spalah;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Ievgen Tararaka
 */
public class TextAnalyzer {
    /**
     * Ваш анализатор текста должен быть тут
     */
    public static void main(String[] args) {
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        File InFile = textAnalyzer.getInFile("text_sample.txt");
        ArrayList<String> text = textAnalyzer.getArrayOfStrings(InFile);
        System.out.println("COUNT OF SYMBOLS: " + textAnalyzer.getCountOfSimbols(text));
        System.out.println("COUNT OF WORDS: " + textAnalyzer.getCountOfWords(text));
        System.out.println("COUNT OF SENTENCES: " + textAnalyzer.getCountOfSentences(text));
        System.out.println("COUNT OF UNIQUE WORDS: " + textAnalyzer.getCountOfUniqueWords(text));
        System.out.println("MOST POPULAR WORD: " + textAnalyzer.getMostPopularWord(text));
        System.out.println("LENGTH OF SHORTEST WORD: " + textAnalyzer.getLengthOfShortestWord(text));
        System.out.println("LENGTH OF LONGEST WORD: " + textAnalyzer.getLengthOfLongestWord(text));
    }

    File getInFile(String num) {
        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource(num).getFile());
    }

    ArrayList<String> getArrayOfStrings(File file) {
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.equals("")){
                    continue;
                }
                arrayList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    int getCountOfSimbols(ArrayList<String> text) {
        int count = 0;
        for (String num:
             text) {
            num = num.replaceAll(" ","");
            count += num.length();
        }
        return count;
    }

    int getCountOfWords(ArrayList<String> text) {
        int count = 0;
        for (String num:
                text) {
            num = num.replaceAll(",","").replaceAll("\\.","").replaceAll(";","");
            String[] words = num.split(" ");
            count += words.length;
        }
        return count;
    }

    int getCountOfSentences(ArrayList<String> text) {
        int count = 0;
        for (String num:
             text) {
            String[] words = num.split(" ");
            for (String word:
                 words) {
                if (word.contains(".")){
                    count++;
                }
            }
        }
        return count;
    }

    int getCountOfUniqueWords(ArrayList<String> text) {
        Set<String> words = new HashSet<String>();
        for (String num:
             text) {
             num = num.replaceAll(",","").replaceAll("\\.","").replaceAll(";","").toLowerCase();
            String[] arrayOfWords = num.split(" ");
            for (String num1:
                 arrayOfWords) {
                words.add(num1);
            }
        }
        return words.size();
    }

    String getMostPopularWord(ArrayList<String> text) {
        Map<String,Integer> words = new HashMap<String,Integer>();
        for (String num:
             text) {
            num = num.replaceAll(",","").replaceAll("\\.","").replaceAll(";","").toLowerCase();
            String[] arrayOfWords = num.split(" ");
            for (String num1:
                 arrayOfWords) {
                    if (!words.containsKey(num1)){
                        words.put(num1,1);
                        continue;
                    }
                    for (Map.Entry<String,Integer> word:
                         words.entrySet()) {
                        if (num1.equals(word.getKey())){
                            word.setValue(word.getValue() + 1);
                        }
                    }

            }
        }

        String mostPopularWord = "";
        int count = 1;
        for (Map.Entry<String,Integer> word:
                words.entrySet()) {
            if (word.getValue() > count){
                mostPopularWord = word.getKey();
                count = word.getValue();
            }
        }

        return mostPopularWord;
    }

    int getLengthOfShortestWord(ArrayList<String> text){
        int length = 16;
        String word = "";
        for (String num:
                text) {
            num = num.replaceAll(",","").replaceAll("\\.","").replaceAll(";","").toLowerCase();
            String[] words = num.split(" ");
            for (String num1:
                 words) {
                if (num1.length() < length){
                    word = num1;
                    length = num1.length();
                }
            }
        }

        return word.length();
    }

    int getLengthOfLongestWord(ArrayList<String> text){
        int length = 1;
        String word = "";
        for (String num:
                text) {
            num = num.replaceAll(",","").replaceAll("\\.","").replaceAll(";","").toLowerCase();
            String[] words = num.split(" ");
            for (String num1:
                 words) {
                if (num1.length() > length){
                    word = num1;
                    length = num1.length();
                }
            }
        }

        return word.length();
    }
}
