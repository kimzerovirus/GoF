package builder;

public class Car {
    private String engine;
    private boolean isAirbag;
    private String color;
    private boolean isCameraSensor;
    private boolean isAEB;

    public Car(String engine, boolean isAirbag, String color, boolean isCameraSensor, boolean isAEB) {
        this.engine = engine;
        this.isAirbag = isAirbag;
        this.color = color;
        this.isCameraSensor = isCameraSensor;
        this.isAEB = isAEB;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("# CAR SPEC");
        sb.append("\n");
        sb.append(" CameraSensor: " + (isCameraSensor ? "Y" : "N"));
        sb.append("\n");
        sb.append("       Engine: " + engine);
        sb.append("\n");
        sb.append("       Airbag: " + (isAirbag ? "Y" : "N"));
        sb.append("\n");
        sb.append("        Color: " + color);
        sb.append("\n");
        sb.append("          AEB: " + (isAEB ? "Y" : "N"));
        return sb.toString();
    }

}
