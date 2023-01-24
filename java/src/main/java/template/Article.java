package template;

import java.util.ArrayList;

public class Article {
    private String title;
    private ArrayList<String> contents;
    private String footer;

    public Article(String title, ArrayList<String> contents, String footer) {
        this.title = title;
        this.contents = contents;
        this.footer = footer;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public String getFooter() {
        return footer;
    }
}
