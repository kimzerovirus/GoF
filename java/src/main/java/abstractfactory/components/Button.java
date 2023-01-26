package abstractfactory.components;

public abstract class Button {
    public String caption;

    public Button(String caption) {
        this.caption = caption;
    }

    public void clickEvent(){
        System.out.println(caption+" 버튼을 클릭했습니다.");
    }

    public abstract void render(); // 운영체제에 따라 랜더링 api 가 달라진다.
}
