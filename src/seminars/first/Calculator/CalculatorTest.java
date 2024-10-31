package seminars.first.Calculator;

import seminars.first.Calculator.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {

        // Проверка корректного расчета скидки
        double calculatingDiscountTest = Calculator.calculatingDiscount(100.0,20);
        assertThat(calculatingDiscountTest).isEqualTo(80.0);

        //Проверка расчета для суммы покупки 0
        double calculatingDiscountTestZeroSum = Calculator.calculatingDiscount(0.0,20);
        assertThat(calculatingDiscountTestZeroSum).isEqualTo(0.0);

        //Проверка выброса сообщения для отрицательной суммы покупки
        assertThatThrownBy(()->Calculator.calculatingDiscount(-100.0, 15))
                .isInstanceOf(ArithmeticException.class)
        .hasMessage("Invalid Arguments");

        //Проверка выброса сообщения для отрицательной скидки
        assertThatThrownBy(()->Calculator.calculatingDiscount(100.0, -15))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid Arguments");

        //Проверка выброса сообщения для скидки больше 100
        assertThatThrownBy(()->Calculator.calculatingDiscount(100.0, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid Arguments");
    }
}