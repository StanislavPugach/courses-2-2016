package com.courses.spalah;

/**
 * Created by Пугач Станислав on 02.08.2016.
 */
 class SmallBig extends WinnerBet {

    public SmallBig(Bet userBet) {
        super(userBet);
    }

    public void findWinner(){
        if (getUserBet().getBet().equals(Bets.SMALL) && (getWinningBet().getNumber() >= 1 && getWinningBet().getNumber() <= 18)
                ||
                getUserBet().getBet().equals(Bets.BIG) && (getWinningBet().getNumber() >= 19 && getWinningBet().getNumber() <= 36)) {

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
