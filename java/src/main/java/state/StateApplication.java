package state;

import java.io.IOException;
import java.util.Scanner;

public class StateApplication {
    /**
     * if 조건문을 나열하지 않고 state(상태) 를 활용하여 깔끔하게 작성하는 패턴
     */

    public static void main(String[] args) throws IOException {
        var player = new Player();
        var sc = new Scanner(System.in);

        while (true) {
            System.out.println("플레이어의 상태: " + player.getState().getDescription() + " / 속도: " + player.getSpeed() + "km/h");
            System.out.print("[1]제자리 서기 [2]앉기 [3]걷기 [4]뛰기 [5]종료: ");

            var input = sc.next();
            System.out.println();

            switch (input) {
                case "1":
                    player.getState().standUp();
                    break;
                case "2":
                    player.getState().sitDown();
                    break;
                case "3":
                    player.getState().walk();
                    break;
                case "4":
                    player.getState().run();
                    break;
                default:
                    sc.close();
            }
        }
    }
}
