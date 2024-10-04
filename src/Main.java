public class Main {
    public static void main(String[] args) {

        System.out.println("Старт!");

        try {

            boolean endOfInput = true;
            while (endOfInput) {

                int number = CheckInput.inputNumberSelect();

                // способ перевірки ввода номера фігури
                CheckInput.checkNumberSelectForError(number);
                if (!CheckInput.getIsError()) {
                    //або способ перевірки ввода номера фігури
                    EnumShape selectShape = SelectShape.chooseShapeByNumber(number);
                    if (EnumShape.End == selectShape) {
                        break;
                    }
                    if (EnumShape.NullShape != selectShape) {

                        Shape shape = SelectShape.chooseShape(selectShape);
                        System.out.println("Ввод параметров фігури: " + shape.getName());
                        shape.setParams();
                        ViewDraw viewDraw = new ViewDraw(shape);
                        viewDraw.getNameShape();
                        viewDraw.draw();
                    }
                } //else endOfInput = false;
                System.out.println("*********************************************************");
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            CheckInput.in.close();
            System.out.println("Кінець!");
        }
    }
}