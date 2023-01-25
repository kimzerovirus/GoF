package factory;

public class FactoryApplication {
    /**
     * 객체 생성을 위한 패턴
     * 객체 생성에 필요한 과정을 템플릿처럼 정해 놓고 각 과정을 다양하게 구현이 가능함
     * 구체적으로 생성할 클래스를 유연하게 정할 수 있음
     * 객체 생성에 대한 인터페이스와 구현의 분리
     */

    public static void main(String[] args) {
        var itemFactory = new ItemFactory();

        var item1 = itemFactory.create("sword");
        if(item1 != null) item1.use();

        var item2 = itemFactory.create("sword");
        if(item2 != null) item2.use();

        var item3 = itemFactory.create("sword");
        if(item3 != null) item3.use();

        var item4 = itemFactory.create("sword");
        if(item4 != null) item4.use();

        var item5 = itemFactory.create("sword");
        if(item5 != null) item5.use();

        itemFactory.create("shield");
        itemFactory.create("shield");
        itemFactory.create("shield");

        itemFactory.create("bow");
        itemFactory.create("bow");

        itemFactory.create("gun");
    }
}
