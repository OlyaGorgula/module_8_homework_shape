public class ShapeParallelogram extends Shape{
    private final String name = "Паралелограм";
    public final EnumShape enumShape = EnumShape.Parallelogram;

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
        params[2] = CheckInput.inputNumberFloat("angle: ");
    }

    @Override
    public String drawView(){
        String drawSring = "Трикутник: сторона 1 = "+params[0]+", сторона 2 = "+params[1]+", кут між сторонами= "+params[2];
        return drawSring;
    }
}
