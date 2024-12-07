package FileSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String username;
    public List<File>filesList;
    public List<Folder>folderList;

    User(String username) {
        this.username = username;
        this.filesList = new ArrayList<>();
        this.folderList = new ArrayList<>();
    }

    public  FileProxy uploadFile(File file) {
        filesList.add(file);
        FileStorageManager.getInstance().addFile(file);
        return new FileProxy(file);
    }
    public File createFile(String filename) {
        File file = new File(filename);
        file.owner = username;
        return file;
    }

}
