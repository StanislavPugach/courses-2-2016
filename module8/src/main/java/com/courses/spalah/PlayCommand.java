package com.courses.spalah;

import java.util.ArrayList;


/**
 * Created by Пугач Станислав on 31.07.2016.
 */
 class PlayCommand extends Command
{
    public PlayCommand(String[] command) {
        super(command);
    }

    @Override
    public void execute() {
        ArrayList<PlayBet> value = PlayBet.getUsersBets();
        Table.getTable().spinRoulette();
        value.forEach(PlayBet::findWinner);
        Table.getTable().resetBets();
    }


}
