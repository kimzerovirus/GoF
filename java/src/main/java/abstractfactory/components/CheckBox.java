package abstractfactory.components;

public abstract class CheckBox {
    protected boolean isChecked;

    public CheckBox(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
        render();
    }

    public abstract void render();
}
