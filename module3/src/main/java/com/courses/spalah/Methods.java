package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class Methods {
    public double calculateAnswer(double wingSpan, int numberOfEngines) { // типичный метод
        //do the calculation here
        double answer = 0.0D;
        if (numberOfEngines > 0) {
            answer = wingSpan * numberOfEngines;
        }
        return answer;
    }

    void foo(){

    } // минимально-валидный метод
}
