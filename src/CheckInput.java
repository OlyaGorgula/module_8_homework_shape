import java.util.Scanner;

class CheckInput {

    private static boolean isError = false;
    public static final Scanner in;

    static {
        in = new Scanner(System.in);
    }

    public static boolean getIsError(){
        return isError;
    }

    public static void checkNumberSelectForError(int number) {
        if (!checkFigureNumber(number)){
            isError = true;
            new thisError.IllegalArgumentSelectNumberException();
        } else { isError = false; }
    }

    public static boolean checkFigureNumber(int number) {
        if (number >0 && number <= 6){
            return true;
        }
        return false;
    }

    public static void checkNumberFloatForError(float number) {
        if (!checkNumberFloat(number)){
            isError = true;
            new thisError.IllegalArgumentFloatException();
        } else { isError = false; }
    }

    public static boolean checkNumberFloat(float number) {
        if (number >0f && number <= 100f){
            return true;
        }
        return false;
    }

    public static int inputNumberSelect(){
        System.out.println("1. Quad  2-Triangle  3-Parallelogram  4-Circle  5-Rectangle  6-Виход з програми");
        System.out.print("Введіть номер фігури: ");
        int number = 0;
        try {
            number = in.nextInt();
        } catch (Exception ex) {
            throw new thisError.IllegalArgumentSelectNumberException();
        }

        return number;
    }

    public static float inputNumberFloat(String text){
        float params = 0f;
        boolean endOfInput = true;
        while (endOfInput){
            System.out.print(text);
            try {
                params = in.nextFloat();
                checkNumberFloatForError(params);
                if (isError) {
                    params = 0f;
                }else{
                    endOfInput = false;
                }
            } catch (Exception ex) {
                throw new thisError.IllegalArgumentFloatException();
            }
        }

        return params;
    }
}
