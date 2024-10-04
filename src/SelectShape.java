public class SelectShape {

    public static EnumShape chooseShapeByNumber(int number){
        switch (number){
            case 1: return EnumShape.Quad;
            case 2: return EnumShape.Triangle;
            case 3: return EnumShape.Parallelogram;
            case 4: return EnumShape.Circle;
            case 5: return EnumShape.Rectangle;
            case 6: return EnumShape.End;
            default: return EnumShape.NullShape;
        }
    }

    public static Shape chooseShape(EnumShape enumShape){
        switch (enumShape){
            case EnumShape.Quad: return new ShapeQuad();
            case EnumShape.Triangle: return new ShapeTriangle();
            case EnumShape.Parallelogram: return new ShapeParallelogram();
            case EnumShape.Circle: return new ShapeCircle();
            case EnumShape.Rectangle: return new ShapeRectangle();
            default: return new ShapeNull();
        }
    }
}
