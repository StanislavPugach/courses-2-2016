package com.courses.spalah;

/**
 * Created by Пугач Станислав on 02.08.2016.
 */
class StraightUp extends WinnerBet {

    public StraightUp(Bet userBet) {
        super(userBet);
    }

    public void findWinner() {
        if (getUserBet().getBet().equals(Bets.STRAIGHT_UP) && getUserBet().getNumber() == getWinningBet().getNumber()) {

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
