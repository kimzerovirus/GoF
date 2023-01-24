package template;

import java.util.ArrayList;

public class CaptionDisplayArticle extends DisplayArticleTemplate {
    public CaptionDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println("TITLE: " + article.getTitle());
    }

    @Override
    protected void content() {

        ArrayList<String> contents = article.getContents();
        for (String content : contents) {
            System.out.println("CONTENT: " + content);
        }
    }

    @Override
    protected void footer() {
        System.out.println("FOOTER: " + article.getFooter());
    }
}
