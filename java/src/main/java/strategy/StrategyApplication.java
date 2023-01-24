package strategy;

/**
 * Object 책에서 coupon 전략 패턴과 같은 내용
 */

public class StrategyApplication {
    public static void main(String[] args) {
        SumPrinter cal = new SumPrinter();

        cal.print(new SimpleSumStrategy(), 10);
        cal.print(new GaussSumStrategy(), 100);
    }
}
