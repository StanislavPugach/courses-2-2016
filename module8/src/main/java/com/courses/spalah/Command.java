package com.courses.spalah;

/**
 * Created by Пугач Станислав on 31.07.2016.
 */
abstract class Command {
    private String[] command;

    Command(String[] command) {
        this.command = command;
    }

    static Command getExactCommand(String[] command) {
        Commands switchCommand = Commands.valueOf(command[0]);
        Command result = null;
        switch (switchCommand) {
            case NEW_USER:
                result = new NewUserCommand(command);
                break;
            case BET:
                result = new BetCommand(command);
                break;
            case PLAY_GAME:
                result = new PlayCommand(command);
                break;
            case EXIT:
                result = new ExitCommand(command);
                break;
        }
        return result;
    }

    abstract void execute();

    String[] getCommand() {
        return command;
    }
}
