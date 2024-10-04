public class ShapeTriangle extends Shape{
    private final String name = "Трикутник";
    public final EnumShape enumShape = EnumShape.Triangle;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void initParams(){
        params = new float[3];
        params[0] = 0f;
        params[1] = 0f;
        params[2] = 0f;
    }

    @Override
    public void setParams() {
        params[0] = CheckInput.inputNumberFloat("side 1: ");
        params[1] = CheckInput.inputNumberFloat("side 2: ");
        params[2] = CheckInput.inputNumberFloat("basis: ");
    }

    @Override
    public String drawView(){
        String drawSring = "Трикутник: сторона 1 = "+params[0]+", сторона 2 = "+params[1]+", основа = "+params[2];
        return drawSring;
    }
}
