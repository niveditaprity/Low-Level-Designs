package Design_Pattern.Structural.Proxy.Virtual;

public class ProxyImage {
    public  RealImage realImage;
    public String fileName;

    ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
