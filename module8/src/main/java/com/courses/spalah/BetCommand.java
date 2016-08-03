package com.courses.spalah;

import static com.courses.spalah.Bets.*;
import com.courses.spalah.Table.*;

/**
 * Created by Пугач Станислав on 31.07.2016.
 */
class BetCommand extends Command {
    public BetCommand(String[] command) {
        super(command);
    }

    @Override
    public void execute() {
        String[] command = super.getCommand();
        Bets switchBet = Bets.valueOf(command[3]);
        switch (switchBet) {
            case RED:
                Bet redBet = new Bet(RED, command[1], Float.parseFloat(command[2]));
                Table.getTable().addBet(redBet);
                break;
            case BLACK:
                Bet blackBet = new Bet(BLACK, command[1], Float.parseFloat(command[2]));
                Table.getTable().addBet(blackBet);
                break;
            case ODD:
                Bet oddBet = new Bet(ODD, command[1], Float.parseFloat(command[2]));;
                Table.getTable().addBet(oddBet);
                break;
            case EVEN:
                Bet evenBet = new Bet(EVEN, command[1], Float.parseFloat(command[2]));
                Table.getTable().addBet(evenBet);
                break;
            case SMALL:
                Bet smallBet = new Bet(SMALL, command[1], Float.parseFloat(command[2]));
                Table.getTable().addBet(smallBet);
                break;
            case BIG:
                Bet bigBet = new Bet(BIG, command[1], Float.parseFloat(command[2]));
                Table.getTable().addBet(bigBet);
                break;
            case STRAIGHT_UP:
                Bet straightUpBet = new Bet(STRAIGHT_UP, Float.parseFloat(command[2]), command[1], Integer.parseInt(command[4]));
                Table.getTable().addBet(straightUpBet);
                break;
        }
    }
}

