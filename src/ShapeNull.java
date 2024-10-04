
public class ShapeNull extends Shape{
    public final String name = "NullShape";
    public final EnumShape enumShape = EnumShape.NullShape;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void initParams(){
    }

    @Override
    public void setParams() {
    }

    @Override
    public String drawView(){
        String drawSring = "Пусто";
        return drawSring;
    }
}
