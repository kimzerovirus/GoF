package builder;

public class CarBuilder {
    private String engine;
    private boolean isAirbag;
    private String color;
    private boolean isCameraSensor;
    private boolean isAEB;

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setAirbag(boolean airbag) {
        isAirbag = airbag;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setCameraSensor(boolean cameraSensor) {
        isCameraSensor = cameraSensor;
        return this;
    }

    public CarBuilder setAEB(boolean AEB) {
        isAEB = AEB;
        return this;
    }

    public Car build(){
        return new Car(engine, isAirbag, color, isCameraSensor, isAEB);
    }
}
