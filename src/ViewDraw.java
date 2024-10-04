public class ViewDraw {
    private Shape shape;

    public ViewDraw(Shape shape){
        this.shape = shape;
    }

    public void getNameShape(){
        System.out.println("Фігура: "+shape.getName()+".");
    }

    public void draw(){
        System.out.println(shape.drawView());
    }

}
