package com.courses.spalah;

import java.util.ArrayList;

/**
 * Created by Пугач Станислав on 02.08.2016.
 */
 abstract class WinnerBet {

    private Cell winningBet;
    private Bet userBet;
    private Roulette roulette;
    private static Table table;


    public WinnerBet(Bet userBet) {
        this.winningBet = roulette.getWinningBet();
        this.userBet = userBet;
        table = Table.getTable();
    }

    public ArrayList<WinnerBet> getWinnerBet() {
        ArrayList<WinnerBet> winnerBet = new ArrayList<>();

        for (Bet bet :
                table.getBets()) {

            Bets switchCase = Bets.valueOf(bet.getBet().toString());

            switch (switchCase){
                case RED:
                case BLACK:
                    winnerBet.add(new RedBlack(bet));
                    break;
                case ODD:
                case EVEN:
                    winnerBet.add(new OddEven(bet));
                    break;
                case SMALL:
                case BIG:
                    winnerBet.add(new SmallBig(bet));
                    break;
                case STRAIGHT_UP:
                    winnerBet.add(new StraightUp(bet));
                    break;
            }
        }
        return winnerBet;
    }

    public abstract void findWinner();

    public Cell getWinningBet() {
        return winningBet;
    }

    public Bet getUserBet() {
        return userBet;
    }

    public Table getTable() {
        return table;
    }
}
