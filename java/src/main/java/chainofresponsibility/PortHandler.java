package chainofresponsibility;

// url 에서 포트번호 찾아서 출력
public class PortHandler extends Handler {
    @Override
    protected void process(String url) {
        int idx = url.lastIndexOf(":");
        if (idx != -1) {
            String strPort = url.substring(idx + 1);
            try {
                int port = Integer.parseInt(strPort);
                System.out.println("PORT: " + port);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("NO PORT");
        }
    }
}
