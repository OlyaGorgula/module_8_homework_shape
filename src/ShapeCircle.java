public class ShapeCircle extends Shape{
    private final String name = "Коло";
    public final EnumShape enumShape = EnumShape.Circle;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void initParams(){
        params = new float[1];
        params[0] = 0f;
    }

    @Override
    public void setParams() {
        params[0] = CheckInput.inputNumberFloat("radius: ");
    }

    @Override
    public String drawView(){
        String drawSring = "Коло: радіус = "+params[0];
        return drawSring;
    }
}
