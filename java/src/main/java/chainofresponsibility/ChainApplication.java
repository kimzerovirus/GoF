package chainofresponsibility;

public class ChainApplication {
    /**
     * 책임을 연결
     * 여러개의 책임을 동적으로 = 실행 중에 연결
     *
     * 책임이란 무언가를 처리하는 기능(클래스)
     * 여러 개의 책임들을 동적으로 연결해서 순차적으로 실행하는 패턴
     * 기능을 클래스 별로 분리하여 구현하도록 유도하므로 클래스의 코드가 최적화됨
     */

    public static void main(String[] args) {
        var handler1 = new ProtocolHandler();
        var handler2 = new PortHandler();
        var handler3 = new DomainHandler();

        handler1.setNext(handler2).setNext(handler3);

        String url = "http://www.youtube.com:1000";
        System.out.println("INPUT: " + url);

        handler1.run(url);
    }
}
