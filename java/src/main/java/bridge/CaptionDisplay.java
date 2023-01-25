package bridge;

public class CaptionDisplay implements Display{
    @Override
    public void title(Draft draft) {
        System.out.println("TITLE: " + draft.getTitle());
    }

    @Override
    public void author(Draft draft) {
        System.out.println("AUTHOR: " + draft.getAuthor());
    }

    @Override
    public void content(Draft draft) {
        for (String content : draft.getContent()) {
            System.out.println("CONTENT: " + content);
        }
    }
}
