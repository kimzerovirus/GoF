package builder2;

public class XmlBuilder extends Builder{
    public XmlBuilder(Data data) {
        super(data);
    }

    @Override
    public String head() {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
    }

    @Override
    public String body() {
        var sb = new StringBuilder();
        sb.append("\n");
        sb.append("    <NAME>");
        sb.append("\n");
        sb.append("       " + data.getName());
        sb.append("\n");
        sb.append("    </NAME>");
        sb.append("\n");
        sb.append("    <AGE>");
        sb.append("\n");
        sb.append("       " + data.getAge());
        sb.append("\n");
        sb.append("    </AGE>");
        sb.append("\n");

        return sb.toString();
    }

    @Override
    public String foot() {
        return "</DATA>";
    }
}
