package strategy;

public class GaussSumStrategy implements SumStrategy{
    /**
     * 가우스 합 공식 - 등차수열의 합
     * 1 ~ N 까지의 합은 N+1이 N개 있는 것의 절반이다.
     * ex) 1 + 100, 2 + 99 ... => 101 * 100 / 2
     */

    @Override
    public int get(int N) {
        return (N + 1) * N / 2;
    }
}
