package proxy2;

public class ProxyApplication {
    public static void main(String[] args) {
        RealImage realImage = new RealImage("RealImage");
        realImage.displayImage();

        var image1 = new ProxyImage("Image1");
        var image2 = new ProxyImage("Image2");
        var image3 = new ProxyImage("Image3");

        image1.displayImage();
        image2.displayImage();
        image3.displayImage();
        System.out.println();
        image1.displayImage();
        image2.displayImage();
        image3.displayImage();
    }
}
