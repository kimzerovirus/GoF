package iterator;

/**
 * Iterator 패턴은 배열이나 링크드리스트, 트리와 같은
 * 다양한 패턴의 컨테이너(애그리케이터 = 동일한 데이터 항목을 여러개 가지고 있는 묶음)의
 * 구성 데이터를 참조할 수 있는 표준화 된 공통 API를 제공할 수 있다.
 */

public class IteratorApplication {
    public static void main(String[] args) {
        Item[] items = {
                new Item("CPU", 1000),
                new Item("GPU", 999000),
                new Item("RAM", 3000),
                new Item("MOUSE", 500),
        };

        Array array = new Array(items);
        Iterator iter = array.iterator();

        while (iter.next()) {
            Item item = (Item) iter.current();
            System.out.println(item);
        }
    }
}


