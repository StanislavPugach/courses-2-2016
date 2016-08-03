package com.courses.spalah;

/**
 * Created by Пугач Станислав on 02.08.2016.
 */
class RedBlack extends WinnerBet {

    public RedBlack(Bet userBet) {
        super(userBet);
    }

    public void findWinner() {
        if (getUserBet().getBet().equals(Bets.RED) && getWinningBet().getColor() == 1
                ||
                getUserBet().getBet().equals(Bets.BLACK) && getWinningBet().getColor() == 2) {

            for (User user :
                    super.getTable().getUsers()) {
                if (user.getName().equals(super.getUserBet().getUserName())) {
                    user.setAccount(user.getAccount() + super.getUserBet().getAmount());

                    System.out.println("Player" + super.getUserBet().getUserName() + "+" + super.getUserBet().getAmount());
                }
            }

        } else {
            for (User user :
                    super.getTable().getUsers()) {
                if (user.getName().equals(super.getUserBet().getUserName())) {
                    user.setAccount(user.getAccount() - super.getUserBet().getAmount());

                    System.out.println("Player" + super.getUserBet().getUserName() + "-" + super.getUserBet().getAmount());
                }
            }
        }
    }
}
