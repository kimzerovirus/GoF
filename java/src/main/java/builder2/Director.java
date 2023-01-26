package builder2;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public String build(){
        var sb = new StringBuilder();

        sb.append(builder.head());
        sb.append(builder.body());
        sb.append(builder.foot());

        return sb.toString();
    }
}
