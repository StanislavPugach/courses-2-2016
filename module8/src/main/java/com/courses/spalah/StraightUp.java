package com.courses.spalah;

/**
 * Created by Пугач Станислав on 02.08.2016.
 */
class StraightUp extends PlayBet {

    public StraightUp(Bet userBet) {
        super(userBet);
    }

    @Override
    public void findWinner(){
        for (User user :
                Table.getTable().getUsers()) {
            if (user.getName().equals(getUserBet().getUserName())) {
                if (isWin()){
                    user.setAccount(user.getAccount() + getUserBet().getAmount());
                    System.out.println("Player" + getUserBet().getUserName() + "+" + getUserBet().getAmount() * 35);
                }
                else {
                    user.setAccount(user.getAccount() - getUserBet().getAmount());
                    System.out.println("Player" + getUserBet().getUserName() + "-" + getUserBet().getAmount());
                }
            }
        }
    }

    @Override
    public boolean isWin() {
        return getUserBet().getBet().equals(Bets.STRAIGHT_UP) && getUserBet().getNumber() == table.getWinnerBet().getNumber();
    }


}
