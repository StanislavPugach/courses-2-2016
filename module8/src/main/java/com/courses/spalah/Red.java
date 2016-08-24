package com.courses.spalah;

/**
 * Created by Stanislav Pugach on 16.08.2016.
 */
 class Red extends PlayBet {

     Red(Bet userBet) {
        super(userBet);
    }

    @Override
    public boolean isWin() {
        return (getUserBet().getBet().equals(Bets.RED) && table.getWinnerBet().getColor() == 1);
    }


}
