package builder;

public class BuilderApplication {
    /**
     * 복잡한 구성의 객체를 효과적으로 생성하는 패턴
     * Builder 는 2가지 방식이 있음
     * - 생성시 지정해야 할 인자가 많을 때 사용하는 패턴 builder
     * - 객체 생성 시 여러 단계를 순차적으로 거칠 때, 이 단계의 순서를 결정해 두고 각 단계를 다양하게 구현할 수 있도록 하는 패턴 buidler2 <- 딱히 볼 필요는 없는듯
     */

    public static void main(String[] args) {
        var car1 = new Car("V7",true, "Black", true, false);
        var car2 = new CarBuilder()
                .setEngine("V8")
                .setAEB(false)
                .setCameraSensor(true)
                .setColor("White")
                .setAirbag(true)
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}
