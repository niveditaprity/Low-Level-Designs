package Design_Pattern.Structural.Proxy.Virtual;

public class RealImage implements  Image{
    public String filename;

    RealImage(String filename) {
        this.filename = filename;
    }
    @Override
    public void display() {
        System.out.println("Displaying Image:" + filename);

    }
}
