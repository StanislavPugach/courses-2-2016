package com.courses.spalah;

import java.util.ArrayList;

/**
 * Created by Пугач Станислав on 31.07.2016.
 */
 class PlayCommand extends Command
{
    WinnerBet winnerBet;
    Table table;

    public PlayCommand(String[] command) {
        super(command);
        table = Table.getTable();
    }

    @Override
    public void execute() {
        ArrayList<WinnerBet> value = winnerBet.getWinnerBet();
        value.forEach(WinnerBet::findWinner);
        table.resetBets();
    }
}
