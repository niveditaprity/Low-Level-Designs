package FileSystem;

import java.util.ArrayList;
import java.util.List;

public class FileStorageManager {
    public static FileStorageManager fileStorageManager;
    List<File> fileList;
    List<Folder>folderList;

    FileStorageManager() {
        this.folderList = new ArrayList<>();
        this.fileList = new ArrayList<>();
    }

    public static FileStorageManager getInstance() {
        if(fileStorageManager == null) {
            fileStorageManager = new FileStorageManager();
        }
        return fileStorageManager;
    }

    public void addFile(File file) {
        System.out.println("File is added :" + file.filename);
        this.fileList.add(file);
    }

    public void removeFile(File file) {
        System.out.println("File is removed: " + file.filename);
        this.fileList.remove(file);
    }

    public void addFolder(Folder folder) {
        System.out.println("Folder is added :" + folder.foldername);
        this.folderList.add(folder);
    }

    public void removeFolder(Folder folder) {
        System.out.println("File is removed: " + folder.foldername);
        this.folderList.remove(folder);
    }


    public List<File> getFileList() {
        return fileList;
    }

    public List<Folder> getFolderList() {
        return folderList;
    }
}