package builder2;

public class JsonBuilder extends Builder{
    public JsonBuilder(Data data) {
        super(data);
    }

    @Override
    public String head() {
        return "{";
    }

    @Override
    public String body() {
        return "\"Name\": " + data.getName() + ", \"Age\": " + data.getAge();
    }

    @Override
    public String foot() {
        return "}";
    }
}
