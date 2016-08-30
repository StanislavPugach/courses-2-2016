package com.courses.spalah;

import java.io.*;

/**
 * Created by Stanislav Pugach on 29.08.2016.
 */
class InfoCommand extends Command {
    InfoCommand(String[] command) {
        super(command);
    }

    @Override
    void execute() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(getInFile("info_file.txt")));
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    File getInFile(String num) {
        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource(num).getFile());
    }
}
