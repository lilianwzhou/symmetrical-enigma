package gitlet;

import java.io.File;
import java.io.Serializable;

public class Gitlet implements Serializable {
    static Gitlet shared = new Gitlet();

    static final private String BASE_DIR = ".gitlet/";

    static String getBaseDir() {
        return BASE_DIR;
    }
    static String getCommitsDir() {
        return BASE_DIR + "/commits/";
    }
    static String getGitletPath() {
        return BASE_DIR + "/gitlet";
    }
    static String getFilesDir() {
        return BASE_DIR + "/files/";
    }


    public boolean created;
    public StagingArea stagingArea;

    private Gitlet() {
        File gitletDirectory = new File(getBaseDir());
        created = gitletDirectory.exists();
        File gitletFile = new File(getGitletPath());
        if(created) {
            shared = Utils.readObject(gitletFile, Gitlet.class);
        } else {
            stagingArea = new StagingArea();
        }
    }
}
