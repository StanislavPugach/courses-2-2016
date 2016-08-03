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
        if (table.hasPlace()){
            table.addUser(createUser(super.getCommand()));
        }
    }

    private User createUser(java.lang.String[] command) {
        return new User(command[1], Float.parseFloat(command[2]));
    }
}
