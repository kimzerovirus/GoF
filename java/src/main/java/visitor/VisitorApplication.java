package visitor;

public class VisitorApplication {
    /**
     * 데이터 구조와 데이터 처리를 분리해주는 패턴
     * 데이터 처리 방식을 기존의 소스 코드 변경 없이 새로운 클래스 추가만으로 확장할 수 있음
     * 데이터 구조는 Composite Pattern 을 사용해 표현함
     */

    public static void main(String[] args) {
        ItemList list1 = new ItemList();
        list1.add(new Item(10));
        list1.add(new Item(20));
        list1.add(new Item(30));

        ItemList list2 = new ItemList();
        list2.add(new Item(40));
        list2.add(new Item(50));
        list1.add(list2);

        ItemList list3 = new ItemList();
        list3.add(new Item(60));
        list3.add(new Item(70));
        list1.add(list3);

        var sum = new SumVisitor();
        list1.accept(sum);
        System.out.println("합계: " + sum.getValue());

        var avg = new AvgVisitor();
        list1.accept(avg);
        System.out.println("평균: " + avg.getValue());

    }
}
