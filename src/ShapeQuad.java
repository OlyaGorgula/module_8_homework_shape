public class ShapeQuad extends Shape{
    private final String name = "Квадрат";
    public final EnumShape enumShape = EnumShape.Quad;

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
        params[0] = CheckInput.inputNumberFloat("side: ");
    }

    @Override
    public String drawView(){
        String drawSring = "Квадрат: ширина = "+params[0]+", висота = "+params[0];
        return drawSring;
    }
}
