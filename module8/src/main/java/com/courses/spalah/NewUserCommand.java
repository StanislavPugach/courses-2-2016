package com.courses.spalah;

/**
 * Created by Пугач Станислав on 31.07.2016.
 */
 class NewUserCommand extends Command {

     NewUserCommand(java.lang.String[] command) {
        super(command);
    }

    @Override
    public void execute() {
        Table table = Table.getTable();
        try {
            table.hasPlace();
            table.addUser(createUser(super.getCommand()));
        } catch (NoPlacesAtTheTable ex) {
            System.out.println("There are no places on the table");
        }
    }

    private User createUser(java.lang.String[] command) {
        return new User(command[1], Float.parseFloat(command[2]));
    }
}
