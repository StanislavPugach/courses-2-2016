package com.courses.spalah;

/**
 * Created by Stanislav Pugach on 16.08.2016.
 */
 class Black extends PlayBet {

     Black(Bet userBet) {
        super(userBet);
    }

    @Override
    public boolean isWin() {
        return ( getUserBet().getBet().equals(Bets.BLACK) && table.getWinnerBet().getColor() == 2);
    }

}