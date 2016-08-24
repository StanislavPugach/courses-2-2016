package com.courses.spalah;

/**
 * Created by Пугач Станислав on 31.07.2016.
 */
class Table {

    private User[] users = new User[5];
    private Bet[] bets = new Bet[5];
    private static Table table;
    private Cell winnerBet;

    public static synchronized Table getTable() {
        if (table == null) {
            table = new Table();
        }
        return table;
    }

    public void resetTable() {
        table = new Table();
    }

     void resetBets() {
        bets = new Bet[5];
    }

     boolean hasPlace() {
        boolean result = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                result = true;
                break;
            }
        }

        if (!result) {
            System.out.println("There are no places on the table");
        }
        return result;
    }

     void addUser(User user) {

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }

        System.out.println("New user with name = " +
                user.getName() + " and balance = " +
                user.getAccount() + " is added to table");
    }

     void addBet(Bet bet) {

        switch (isBetLegal(bet)) {
            case 2:
                System.out.println("User has already made a bet");
                break;
            case 3:
                System.out.println("User don`t have so much money");
                break;
            case 1:
                for (int i = 0; i < bets.length; i++) {
                    if (bets[i] == null) {
                        bets[i] = bet;
                        System.out.println("Bet is excepted");
                        break;
                    }
                }

        }
    }

    private int isBetLegal(Bet bet) {
        int result = 1;
        //TODO заменить на исключения

        for (Bet num :
                bets) {
            if (num == null) {
                continue;
            }
            if (num.getUserName().equals(bet.getUserName())) {
                result = 2;
                break;
            }
        }

        for (User num :
                users) {
            if (num == null) {
                continue;
            }
            if (num.getName().equals(bet.getUserName())) {
                if (num.getAccount() < bet.getAmount()) {
                    result = 3;
                    break;
                }
            }
        }

        return result;
    }

     void spinRoulette() {
        winnerBet = Roulette.getRoulette().getWinningBet();
    }

     User[] getUsers() {
        return users;
    }

     Bet[] getBets() {
        return bets;
    }

     Cell getWinnerBet() {
        return winnerBet;
    }
}
