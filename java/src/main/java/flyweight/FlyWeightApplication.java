package flyweight;

public class FlyWeightApplication {
    /**
     * 복싱 경량급에서 따옴
     *
     * 어떤 객체를 사용하기 위해 매번 생성하지 않고 한번만 생성하고 다시 필요해 질때는 이전에 생성된 객체를 재사용
     * 객체를 생성할 때 많은 자원이 소모될 경우 플라이웨이트 패턴을 적용하여 훨씬 적은 자원만으로 객체를 재사용할 수 있음
     *
     * digitFactory 에 digit 을 담아두고
     * 필요한 것들을 꺼내주는데 digit 을 재사용함
     */

    public static void main(String[] args) {
        Number number = new Number(434331);
        number.print(5, 5);

        System.out.println();
        System.out.println();
        System.out.println();
    }
}
