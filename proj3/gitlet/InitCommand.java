package gitlet;

import java.io.File;

public class InitCommand implements Command {

    int validArgumentCount = 0;
    InitCommand(String[] args) {

        if(args.length != validArgumentCount) {
            //TODO: REAL ERROR HANDLING
            throw new GitletException("MESSAGE GOES HERE");
        }
    }

    @Override
    public void run() {
        if(!Gitlet.shared.created) {

            File newDirectory = new File(Gitlet.getBaseDir());
            newDirectory.mkdirs();

            File commitsDirectory = new File(Gitlet.getCommitsDir());
            commitsDirectory.mkdirs();

            File filesDirectory = new File(Gitlet.getFilesDir());
            filesDirectory.mkdirs();

            File gitletFile = new File(Gitlet.getGitletPath());
            gitletFile.mkdirs();
            Gitlet.shared.created = true;
            Utils.writeObject(gitletFile, Gitlet.shared);
        }
    }
}
