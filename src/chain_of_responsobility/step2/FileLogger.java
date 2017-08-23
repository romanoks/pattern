package chain_of_responsobility.step2;

import chain_of_responsobility.step1.AbstractLogger;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}