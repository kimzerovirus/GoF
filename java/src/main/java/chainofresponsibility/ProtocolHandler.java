package chainofresponsibility;

// 어떤 프로토콜인지 찾아서 출력
public class ProtocolHandler extends Handler{
    @Override
    protected void process(String url) {
        int idx = url.indexOf("://");
        if (idx != -1) {
            System.out.println("PROTOCOL: " + url.substring(0, idx));
        } else {
            System.out.println("NO PROTOCOL");
        }
    }
}
