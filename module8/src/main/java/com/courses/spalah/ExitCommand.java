package com.courses.spalah;

/**
 * Created by Пугач Станислав on 31.07.2016.
 */
 class ExitCommand extends Command {

    public ExitCommand(String[] command) {
        super(command);
    }

    @Override
    public void execute() {
        ConsoleRoulette.setLoopGame(false);
    }
}
