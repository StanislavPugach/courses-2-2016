package com.courses.spalah;

/**
 * Created by Stanislav Pugach on 17.08.2016.
 */
 class Small extends PlayBet{

     Small(Bet userBet) {
        super(userBet);
    }

    @Override
    public boolean isWin() {
        return getUserBet().getBet().equals(Bets.SMALL) && (table.getWinnerBet().getNumber() >= 1 && table.getWinnerBet().getNumber() <= 18);
    }
}
