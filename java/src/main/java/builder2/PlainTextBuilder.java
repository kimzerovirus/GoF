package builder2;

public class PlainTextBuilder extends Builder{
    public PlainTextBuilder(Data data) {
        super(data);
    }

    @Override
    public String head() {
        return "";
    }

    @Override
    public String body() {
        return "Name: " + data.getName() + ", Age: " + data.getAge();
    }

    @Override
    public String foot() {
        return "";
    }
}
