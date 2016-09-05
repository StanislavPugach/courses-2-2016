package com.courses.spalah;

import java.io.*;
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
        File OutFile = new File("E:/test.txt");
        ArrayList<String> text = textAnalyzer.getArrayOfStrings(InFile);
        textAnalyzer.writeStatistic(OutFile, text);
    }

     void writeStatistic(File file, ArrayList<String> text) {
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.println("COUNT OF SYMBOLS: " + getCountOfSymbols(text));
            writer.println("COUNT OF WORDS: " + getCountOfWords(text));
            writer.println("COUNT OF SENTENCES: " + getCountOfSentences(text));
            writer.println("COUNT OF UNIQUE WORDS: " + getCountOfUniqueWords(text));
            writer.println("MOST POPULAR WORD: " + getMostPopularWord(text));
            writer.println("LENGTH OF SHORTEST WORD: " + getLengthOfShortestWord(text));
            writer.println("LENGTH OF LONGEST WORD: " + getLengthOfLongestWord(text));
            writer.println("COUNT OF EACH WORD: \n" + getCountEachOfWords(text));
            writer.println("COUNT OF EACH CHARACTER: \n" + getCountEachOfCharacter(text));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private File getInFile(String num) {
        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource(num).getFile());
    }

    private ArrayList<String> getArrayOfStrings(File file) {
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("")) {
                    continue;
                }
                arrayList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    private String[] getArrayOfWords(String text) {
        text = text.replaceAll(",", "").replaceAll("\\.", "").replaceAll(";", "").toLowerCase();
        String[] words = text.split(" ");
        return words;
    }

    private ArrayList<Character> getArrayOfChars(String text) {
        ArrayList<Character> arrayOfChars = new ArrayList<Character>();
        text = text.replaceAll(",", "").replaceAll("\\.", "").replaceAll(";", "").replaceAll(" ", "");
        for (int i = 0; i < text.length(); i++) {
            arrayOfChars.add(text.charAt(i));
        }
        return arrayOfChars;
    }

    private int getCountOfSymbols(ArrayList<String> text) {
        int count = 0;
        for (String num :
                text) {
            num = num.replaceAll(" ", "");
            count += num.length();
        }
        return count;
    }


    private int getCountOfWords(ArrayList<String> text) {
        int count = 0;
        for (String num :
                text) {
            String[] words = getArrayOfWords(num);
            count += words.length;
        }
        return count;
    }

    private int getCountOfSentences(ArrayList<String> text) {
        int count = 0;
        for (String num :
                text) {
            String[] words = num.split(" ");
            for (String word :
                    words) {
                if (word.contains(".")) {
                    count++;
                }
            }
        }
        return count;
    }

    private int getCountOfUniqueWords(ArrayList<String> text) {
        Set<String> words = new HashSet<String>();
        for (String num :
                text) {
            String[] arrayOfWords = getArrayOfWords(num);
            for (String num1 :
                    arrayOfWords) {
                words.add(num1);
            }
        }
        return words.size();
    }

    private String getMostPopularWord(ArrayList<String> text) {
        Map<String, Integer> words = new HashMap<String, Integer>();
        for (String num :
                text) {
            String[] arrayOfWords = getArrayOfWords(num);
            for (String num1 :
                    arrayOfWords) {
                if (!words.containsKey(num1)) {
                    words.put(num1, 1);
                    continue;
                }
                for (Map.Entry<String, Integer> word :
                        words.entrySet()) {
                    if (num1.equals(word.getKey())) {
                        word.setValue(word.getValue() + 1);
                    }
                }

            }
        }

        String mostPopularWord = "";
        int count = 1;
        for (Map.Entry<String, Integer> word :
                words.entrySet()) {
            if (word.getValue() > count) {
                mostPopularWord = word.getKey();
                count = word.getValue();
            }
        }

        return mostPopularWord;
    }

    private int getLengthOfShortestWord(ArrayList<String> text) {
        int length = 16;
        String word = "";
        for (String num :
                text) {
            String[] words = getArrayOfWords(num);
            for (String num1 :
                    words) {
                if (num1.length() < length) {
                    word = num1;
                    length = num1.length();
                }
            }
        }

        return word.length();
    }

    private int getLengthOfLongestWord(ArrayList<String> text) {
        int length = 1;
        String word = "";
        for (String num :
                text) {
            String[] words = getArrayOfWords(num);
            for (String num1 :
                    words) {
                if (num1.length() > length) {
                    word = num1;
                    length = num1.length();
                }
            }
        }

        return word.length();
    }

    private String getCountEachOfWords(ArrayList<String> text) {
        Map<String, Integer> words = new HashMap<String, Integer>();
        for (String num :
                text) {
            String[] arrayOfWords = getArrayOfWords(num);
            for (String num1 :
                    arrayOfWords) {
                if (!words.containsKey(num1)) {
                    words.put(num1, 1);
                    continue;
                }
                for (Map.Entry<String, Integer> word :
                        words.entrySet()) {
                    if (num1.equals(word.getKey())) {
                        word.setValue(word.getValue() + 1);
                    }
                }

            }
        }

        StringBuilder stringOfWords = new StringBuilder();
        for (Map.Entry<String, Integer> word :
                words.entrySet()) {
            stringOfWords.append(word.getKey() + " - " +
                    word.getValue() + "\n");
        }

        return stringOfWords.toString();
    }

    private String getCountEachOfCharacter(ArrayList<String> text) {
        Map<Character, Integer> words = new HashMap<Character, Integer>();

        for (String num :
                text) {
            ArrayList<Character> arrayOfChars = getArrayOfChars(num);
            for (Character ch :
                    arrayOfChars) {

                if (!words.containsKey(ch)) {
                    words.put(ch, 1);
                    continue;
                }
                for (Map.Entry<Character, Integer> word :
                        words.entrySet()) {
                    if (ch == word.getKey()) {
                        word.setValue(word.getValue() + 1);
                    }
                }
            }
        }

        StringBuilder stringOfChars = new StringBuilder();
        for (Map.Entry<Character, Integer> word :
                words.entrySet()) {
            stringOfChars.append(word.getKey() + " - " +
                    word.getValue() + "\n");
        }

        return stringOfChars.toString();
    }
}
