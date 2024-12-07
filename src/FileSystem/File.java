package FileSystem;

import java.util.ArrayList;
import java.util.List;

public class File {
    public String filename;
    public String content;
    public String owner;
    List<String> hasAccess;
     File(String filename) {
         this.filename = filename;
         this.hasAccess = new ArrayList<>();
     }
     public void addContent(String content) {
         this.content +=content;
     }

    public String getContent() {
        return content;
    }

    public String getFilename() {
        return filename;
    }

    public String getOwner() {
        return owner;
    }
    public void addAccess(String username) {
         hasAccess.add(username);
    }
}
