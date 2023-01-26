package proxy2;

public class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    public void loadImageFromDisk(){
        try {
            Thread.sleep(1000); // 이미지 출력을 위한 준비 작업
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Loading " + filename);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying" + filename);
    }
}
