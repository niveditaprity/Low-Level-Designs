package FileSystem;

import java.util.ArrayList;
import java.util.List;

public class FileProxy {
    public File file;
    public List<String> allowedUsers;

    FileProxy(File file) {
        this.file = file;
        allowedUsers = new ArrayList<>();
    }

    public void shareWithUser(String username) {
        if (!allowedUsers.contains(username)) {
            allowedUsers.add(username);
            System.out.println("File '" + file.getFilename() + "' shared with " + username);
            file.addAccess(username);
        }
    }

    // Revoke user access
    public void revokeAccess(String username) {
        if (allowedUsers.remove(username)) {
            System.out.println("Access to file '" + file.getFilename() + "' revoked for " + username);
        }
    }

}
