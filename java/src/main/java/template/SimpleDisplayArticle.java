package template;

import java.util.ArrayList;

public class SimpleDisplayArticle extends DisplayArticleTemplate{
    public SimpleDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println(article.getTitle());
    }

    @Override
    protected void content() {
        ArrayList<String> contents = article.getContents();
        for (String content : contents) {
            System.out.println(content);
        }
    }

    @Override
    protected void footer() {
        System.out.println(article.getFooter());
    }
}
