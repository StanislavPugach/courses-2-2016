package com.courses.spalah;

/**
 * Created by Stanislav Pugach on 17.08.2016.
 */
 class Big extends PlayBet {

     Big(Bet userBet) {
        super(userBet);
    }

    @Override
    public boolean isWin() {
        return getUserBet().getBet().equals(Bets.BIG) && (table.getWinnerBet().getNumber() >= 19 && table.getWinnerBet().getNumber() <= 36);
    }
}
