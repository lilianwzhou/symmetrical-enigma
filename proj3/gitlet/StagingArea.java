package gitlet;

import java.io.Serializable;
import java.util.ArrayList;

public class StagingArea implements Serializable {

    private list<file> File;

    public StagingArea() {

    }

    public void add(String filename) {
        //TODO: check the list and add file if needed
        //if current working version is identical to version in current commit,
        //if the hash for the blobs is the same>>>>>^
        //remove from staging area ?
        //if file is null??? DNE, print "File does not exist."
    }




}
