public class Main {
    public static void main(String[] args) {
        Divisor divisor = (a, b) -> {
            if (b == 0) throw new ArithmeticException("Divisor igual a zero");

            return a / b;
        };

        try {
            System.out.println(divisor.divideNumero(10, 20));
            System.out.println(divisor.divideNumero(10, 0));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}