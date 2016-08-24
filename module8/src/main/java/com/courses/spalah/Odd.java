package com.courses.spalah;

/**
 * Created by Stanislav Pugach on 17.08.2016.
 */
 class Odd extends PlayBet{

     Odd(Bet userBet) {
        super(userBet);
    }

    @Override
    public boolean isWin() {
        return (getUserBet().getBet().equals(Bets.ODD) && table.getWinnerBet().getNumber()%2 != 0);
    }
}
