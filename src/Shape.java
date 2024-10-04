public abstract class Shape {
    private final String name = "Пусто";
    protected float[] params;

    public Shape(){
        initParams();
    }

    public abstract String getName();
    public abstract void initParams();
    public abstract void setParams();
    public abstract String drawView();
}
