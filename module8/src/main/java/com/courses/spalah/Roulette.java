package com.courses.spalah;

import java.util.Random;

/**
 * Created by Пугач Станислав on 29.07.2016.
 */
class Roulette {
    private static Roulette roulette;

    public Roulette() {
        this.roulette = this;
    }

    Cell[] cells = new Cell[37];

    public void generate() {
        Random random = new Random();
        int RedCounter = 0;
        int BlackCounter = 0;
        cells[0] = new Cell(0, 0);

        for (int i = 1; i <= 36; i++) {
            int color = random.nextInt(2);
            if (RedCounter < 18 && color == 0) {
                cells[i] = new Cell(i, 1);
                RedCounter++;
            } else if (BlackCounter < 18) {
                cells[i] = new Cell(i, 2);
                BlackCounter++;
            }
        }
    }

    private int spin() {
        return new Random().nextInt(37);
    }

    public Cell getWinningBet() {
        int number = spin();
        for (Cell num :
                cells) {
            if (num.getNumber() == number){
                return num;
            }
        }
        return null;
    }

    public static Roulette getRoulette() {
        return roulette;
    }
}
