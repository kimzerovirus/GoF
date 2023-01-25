package composite;

public class CompositeApplication {
    /**
     * 객체들의 관계를 트리 구조로 구성하여 부분-전체 계층으로 표현하는 패턴
     * 단일 객체와 복합 객체 모두 동일하게 취급
     */

    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.add(new File("a.txt", 1000));
        root.add(new File("b.txt", 2000));
        root.add(new File("c.txt", 3000));

        Folder sub1 = new Folder("sub1");
        sub1.add(new File("s1a.txt", 100));
        sub1.add(new File("s1b.txt", 200));
        root.add(sub1);

        Folder sub2 = new Folder("sub2");
        sub2.add(new File("s2a.txt", 100));
        sub2.add(new File("s2b.txt", 200));
        root.add(sub2);

        root.printList();
    }
}
