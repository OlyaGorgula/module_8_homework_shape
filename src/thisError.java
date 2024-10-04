public class thisError {
    public static class IllegalArgumentSelectNumberException extends RuntimeException{
        IllegalArgumentSelectNumberException(){
            System.out.println("Не правільно введен номер фігури. Введіть номер 1..5");
            //super("Не правільно введен номер фігури. Введіть номер 1..5");
        }
    }

    public static class IllegalArgumentFloatException extends RuntimeException{
        IllegalArgumentFloatException(){
            System.out.println("Неправильно введене число! Число повинно бути 1..100!");
            //super("Неправильно введене число! Число повинно бути 1..100!");
        }
    }

}
