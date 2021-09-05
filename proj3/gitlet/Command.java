package gitlet;

public interface Command {

    int validArgumentCount = 0;

    abstract void run();
}
