public class ShapeRectangle extends Shape{
    private final String name = "Прямокутник";
    public final EnumShape enumShape = EnumShape.Rectangle;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void initParams(){
        params = new float[2];
        params[0] = 0f;
        params[1] = 0f;
    }

    @Override
    public void setParams() {
        params[0] = CheckInput.inputNumberFloat("width: ");
        params[1] = CheckInput.inputNumberFloat("height: ");
    }

    @Override
    public String drawView(){
        String drawSring = "Прямокутник: ширина = "+params[0]+", висота = "+params[1];
        return drawSring;
    }
}
