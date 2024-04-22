import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        calc.println.accept(c);

//   При выполнении BinaryOperator<Integer> devide = (x, y) -> x / y;  может возникнуть ситуация с тем, что ы будем делить на ноль.
//   Ниже представлен вариант решения проблемы.
//        try {
//            int c = calc.devide.apply(a, b);
//            calc.println.accept(c);
//
//        } catch (ArithmeticException e) {
//            System.out.println("Ошибка : Деление на ноль");
//        }


    }
}
