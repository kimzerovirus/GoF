package builder2;

public class BuilderApplication {
    public static void main(String[] args) {
        var data = new Data("Jane", 20);
        Builder builder = new PlainTextBuilder(data);
        var director = new Director(builder);
        var result = director.build();
        System.out.println(result);

        builder = new JsonBuilder(data);
        director = new Director(builder);
        result = director.build();
        System.out.println(result);

        builder = new XmlBuilder(data);
        director = new Director(builder);
        result = director.build();
        System.out.println(result);
    }
}
