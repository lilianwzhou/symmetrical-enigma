package gitlet;

import java.util.Arrays;

/** Driver class for Gitlet, the tiny stupid version-control system.
 *  @author
 */
public class Main {

    /** Usage: java gitlet.Main ARGS, where ARGS contains
     *  <COMMAND> <OPERAND> .... */
    public static void main(String... args) {
        // FILL THIS IN
        // add text.txt
        if (args.length == 0) {
            System.out.println("HUGH BUNGUS ERROR");
            return;
        }
        CommandType command = CommandType.valueOf(args[0].toUpperCase());
        // CommandType.ADD

        String[] arrayArguments = args;
        command.runCommand(Arrays.copyOfRange(arrayArguments, 1, args.length-1)); //text.txt
    }

    enum CommandType {
        INIT, ADD, COMMIT, CHECKOUT;


        public void runCommand(String[] args) {
            Command command;
            switch (this) {
                case INIT:
                    command = new InitCommand(args);
                    command.run();
                    break;
                case ADD:
                    command = new AddCommand(args);
                    command.run();
                    break;
                case COMMIT:
                    break;
                case CHECKOUT:
                    break;
                default:
                    System.out.println("INVALID COMMAND BIG BIG Errrororororororororor");
            }
        }
    }
}
