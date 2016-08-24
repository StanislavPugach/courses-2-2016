package com.courses.spalah;

import java.util.ArrayList;

/**
 * Created by Пугач Станислав on 02.08.2016.
 */
 abstract class PlayBet {
    private Bet userBet;
    protected Table table = Table.getTable();


    public PlayBet(Bet userBet) {
        this.userBet = userBet;
    }

     static ArrayList<PlayBet> getUsersBets() {
        ArrayList<PlayBet> playBet = new ArrayList<>();
        for (Bet bet :
                Table.getTable().getBets()) {
            if (bet == null) {
                continue;
            }
            Bets switchCase = Bets.valueOf(bet.getBet().toString());

            switch (switchCase){
                case RED:
                    playBet.add(new Red(bet));
                    break;
                case BLACK:
                    playBet.add(new Black(bet));
                    break;
                case ODD:
                    playBet.add(new Odd(bet));
                    break;
                case EVEN:
                    playBet.add(new Even(bet));
                    break;
                case SMALL:
                    playBet.add(new Small(bet));
                    break;
                case BIG:
                    playBet.add(new Big(bet));
                    break;
                case STRAIGHT_UP:
                    playBet.add(new StraightUp(bet));
                    break;
            }
        }
        return playBet;
    }

    public void findWinner(){
        for (User user :
                Table.getTable().getUsers()) {
            if (user == null){
                continue;
            }
            if (user.getName().equals(userBet.getUserName())) {
                if (isWin()){
                    user.setAccount(user.getAccount() + userBet.getAmount());
                    System.out.println("Player " + userBet.getUserName() + " + " + userBet.getAmount() + " Balance: " + user.getAccount());
                }
                else {
                    user.setAccount(user.getAccount() - userBet.getAmount());
                    System.out.println("Player " + userBet.getUserName() + " - " + userBet.getAmount() + " Balance: " + user.getAccount());
                }
            }
        }
    }

    public abstract boolean isWin();

    public Bet getUserBet() {
        return userBet;
    }
}
