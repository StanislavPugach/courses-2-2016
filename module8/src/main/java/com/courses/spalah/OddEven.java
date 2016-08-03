package com.courses.spalah;

/**
 * Created by Пугач Станислав on 02.08.2016.
 */
 class OddEven extends WinnerBet {

    public OddEven( Bet userBet) {
        super(userBet);
    }

    public void findWinner(){
        if (getUserBet().getBet().equals(Bets.ODD) && getWinningBet().getNumber()%2 != 0
                ||
                getUserBet().getBet().equals(Bets.EVEN) && getWinningBet().getNumber()%2 == 0) {

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
