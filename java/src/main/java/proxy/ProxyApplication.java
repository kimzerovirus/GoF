package proxy;

public class ProxyApplication {
    /**
     * proxy: 대리자
     * 응용: 어떤 요청의 결과를 캐시처럼 저장해두고 새로운 요청이 이전의 요청과 동일하다면 실제 처리를 하지않고 기존의 캐시에서 꺼내서 처리하는 방법
     */

    public static void main(String[] args) {
//        Display display = new ScreenDisplay();
        Display display = new BufferDisplay(5);
        display.print("lorem ipsum1");
        display.print("lorem ipsum2");
        display.print("lorem ipsum3");
        display.print("lorem ipsum4");
        display.print("lorem ipsum5");
        display.print("lorem ipsum6");
        display.print("lorem ipsum7");

        ((BufferDisplay) display).flush();
    }
}
