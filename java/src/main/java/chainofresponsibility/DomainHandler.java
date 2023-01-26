package chainofresponsibility;

// 어떤 도메인인지 찾아서 출력
public class DomainHandler extends Handler {
    @Override
    protected void process(String url) {
        int startIdx = url.indexOf("://");
        int lastIdx = url.lastIndexOf(":");

        System.out.print("DOMAIN: ");
        if (startIdx == -1) {
            if (lastIdx == -1) {
                System.out.println(url);
            } else {
                System.out.println(url.substring(0, lastIdx));
            }
        } else if (startIdx != lastIdx) {
            System.out.println(url.substring(startIdx + 3, lastIdx));
        } else {
            System.out.println(url.substring(startIdx + 3));
        }
    }
}
