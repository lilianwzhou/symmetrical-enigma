package gitlet;

public class AddCommand implements Command {

    int validArgumentCount = 1;
    String filename;

    @Override
    public void run() {
        System.out.println(validArgumentCount);
        System.out.println("write implementation for init command");
        Gitlet.shared.stagingArea.add(filename);
    }

    public AddCommand(String[] arguments) {
        if(arguments.length != validArgumentCount) {
            //TODO: REAL ERROR HANDLING
            throw new GitletException("MESSAGE GOES HERE");
        }

        filename = arguments[0];

        return;
    }
}

