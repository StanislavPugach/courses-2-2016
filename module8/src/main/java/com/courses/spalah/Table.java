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

    void hasPlace() throws NoPlacesAtTheTable {
        boolean result = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                result = true;
            }
        }
        if (!result) {
            throw new NoPlacesAtTheTable();
        }
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

        try {
            isBetLegal(bet);

            for (int i = 0; i < bets.length; i++) {
                if (bets[i] == null) {
                    bets[i] = bet;
                    System.out.println("Bet is excepted");
                }
            }
        } catch (NoFundsException e) {
            System.out.println("User don`t have so much money");
        } catch (UserStakedException e) {
            System.out.println("User has already made a bet");
        }
    }

    private void isBetLegal(Bet bet) throws UserStakedException, NoFundsException {
        for (Bet num :
                bets) {
            if (num == null) {
                continue;
            }
            if (num.getUserName().equals(bet.getUserName())) {
                throw new UserStakedException();
            }
        }

        for (User num :
                users) {
            if (num == null) {
                continue;
            }
            if (num.getName().equals(bet.getUserName())) {
                if (num.getAccount() < bet.getAmount()) {
                    throw new NoFundsException();
                }
            }
        }
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
