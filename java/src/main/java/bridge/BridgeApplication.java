package bridge;

public class BridgeApplication {
    /**
     * 기능 계층과 구현 계층의 분리로 시스템의 확장성과 유지보수성을 높이는 패턴
     * 기존 클래스의 변화 없이 기능 추가하기
     *
     * 기능 계층 : Draft(기존 기능), Publication(추가 기능)
     * 구현 계층 : Display, ...
     *
     * Bridge : Draft - Display
     */

    public static void main(String[] args) {
        var title = "냠냠";
        var author = "KZV";
        String[] content = {
                "좋은생각",
                "국민연금 보험료 조정안내",
                "기준소득월액 상,하한액 조정 안내"
        };

        Draft draft = new Draft(title, author, content);
        Display display1 = new SimpleDisplay();
        draft.print(display1);

        Display display2 = new CaptionDisplay();
        draft.print(display2);

        var publisher = "세계문학사";
        var cost = 10000;
        Publication publication = new Publication(title, author, content, publisher, cost);
        publication.print(display2);
    }
}
