package vshp.Shaitanov.Block_3;

public class DivisionByZeroException extends Exception {

    public String getMessage() {
        return "Деление на ноль заппрещено!";
    }
} //Divis... class

class ExceptionDemo {

    private static double divide (double dividend, double divisor)
            throws DivisionByZeroException {

        if (divisor == 0)
            throw new DivisionByZeroException();
        return dividend / divisor;
    } //divide() method

    public static void main(String[] args) {

        try {
            divide(8, 0);
        } catch (DivisionByZeroException dz) {
            System.out.println(dz.getMessage());
        }
    } //main
} // ExceptionDemo class

