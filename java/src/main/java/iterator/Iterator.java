package iterator;

public interface Iterator {
    boolean next(); // aggregator 의 다음 구성 객체를 얻을 수 있으면 true
    Object current();
}
