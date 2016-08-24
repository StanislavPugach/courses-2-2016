package com.courses.spalah;

/**
 * Created by Stanislav Pugach on 17.08.2016.
 */
 class Even extends PlayBet {

     Even(Bet userBet) {
        super(userBet);
    }

    @Override
    public boolean isWin() {
        return (getUserBet().getBet().equals(Bets.EVEN) && table.getWinnerBet().getNumber()%2 == 0);
    }
}
