package mediator;

import java.io.IOException;
import java.util.Scanner;

public class MediatorApplication {
    /**
     * 여러개의 상태 관리를 해줄 중계자를 두고 상태 변화를 감지하는 패턴
     * observer 는 하나를 바라본다면 mediator 는 좀더 복잡한 경우 적합한 패턴인듯?
     */
    public static void main(String[] args) throws IOException {
        var home = new SmartHome();

        Scanner sc = new Scanner(System.in);
        do {
            home.report();
            System.out.println("[1] 문 열기");
            System.out.println("[2] 문 닫기");
            System.out.println("[3] 창문 열기");
            System.out.println("[4] 창문 닫기");
            System.out.println("[5] 에어컨 켜기");
            System.out.println("[6] 에어컨 끄기");
            System.out.println("[7] 보일러 켜기");
            System.out.println("[8] 보일러 끄기");
            System.out.println("아무키 입력시 종료");

            System.out.println("명령어 입력: ");
            order(home, sc);
        } while (true);
    }

    private static void order(SmartHome home, Scanner order) {
        switch (order.nextInt()) {
            case 1:
                home.door.open();
                break;
            case 2:
                home.door.close();
                break;
            case 3:
                home.window.open();
                break;
            case 4:
                home.window.close();
                break;
            case 5:
                home.aircon.on();
                break;
            case 6:
                home.aircon.off();
                break;
            case 7:
                home.boiler.on();
                break;
            case 8:
                home.boiler.off();
                break;
            default:
                order.close();
        }
    }
}
