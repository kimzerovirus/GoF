package template;

import java.util.ArrayList;

public class TemplateApplication {
    /**
     * 어떤 기능에 대해 실행 되어야할 각 단계의 순서만 정의해 두고 각 단계의 세부 구현을 각 상황에 따른 다르게 구현할 수 있는 패턴
     *
     * DisplayArticleTemplate - 각 단계를 정해진 순서대로 실행만 해줌(순서만 정의)
     * SimpleDisplayArticle, CaptionDisplayArticle - 실제 구현
     */

    public static void main(String[] args) {
        String title = "GoF 디자인패턴";

        ArrayList<String> contents = new ArrayList<>();
        contents.add("디자인 패턴은 클래스 간의 효율적이고 최적화된 관계를 설계하는 것!");
        contents.add("각 디자인 패턴을 외우기 보다는 이해하는 것이 중요!");
        contents.add("다양한 디자인 패턴을 접하고 반복적으로 학습하여 이해하자!");
        contents.add("각 디자인 패턴에 대한 응용의 폭을 넓히자!");

        String footer = "2023/01/24 - KZV";

        Article article = new Article(title, contents, footer);

        System.out.println("[CASE-1]");
        DisplayArticleTemplate style1 = new SimpleDisplayArticle(article);
        style1.display();

        System.out.println();

        System.out.println("[CASE-2]");
        DisplayArticleTemplate style2 = new CaptionDisplayArticle(article);
        style2.display();
    }
}
