package abstractfactory.components;

public abstract class CheckBox {
    protected boolean isChecked;

    public CheckBox(boolean isChecked) {
        this.isChecked = isChecked;
    }

    void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
        render();
    }

    public abstract void render();
}
