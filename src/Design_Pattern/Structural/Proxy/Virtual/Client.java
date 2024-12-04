package Design_Pattern.Structural.Proxy.Virtual;

public class Client {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("/image/pic.png");
        RealImage image = proxyImage.realImage;
        proxyImage.display();
        proxyImage.display();
    }
}
