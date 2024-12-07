package FileSystem;

public class Client {
    public static void main(String[] args) {
        User user = new User("niveditaprity");
        File file  = user.createFile("program.txt");
        user.uploadFile(file);
        User user2 = new User("Raj");
        File file2 = user2.createFile("code.cpp");
        FileProxy fileProxy = user.uploadFile(file2);
        fileProxy.shareWithUser("niveditaprity");


        FileStorageManager fileStorageManager = FileStorageManager.getInstance();

        System.out.println("Files in storage:");
        for (File file1 : fileStorageManager.getFileList()) {
            System.out.println("File: " + file1.getFilename() + ", Owner: " + file1.getOwner());
            if(file1.hasAccess.size()>0) {
                System.out.println("HasAccess:" + "hasaccess : "+ file1.hasAccess.get(0));
            }
        }

    }
}
