package seminars.first.Calculator;

import seminars.first.Calculator.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        // Проверка базового функционала с целыми числами:
        if (8 != Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (0 != Calculator.calculation(2, 2, '-')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (14 != Calculator.calculation(2, 7, '*')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (2 != Calculator.calculation(100, 50, '/')) {
            throw new AssertionError("Ошибка в методе");
        }

      
        // Проверка базового функционала с целыми числами, с использованием утверждений:
        assert 8 == Calculator.calculation(2, 6, '+');
        assert 0 == Calculator.calculation(2, 2, '-');
        assert 14 == Calculator.calculation(2, 7, '*');
        assert 2 == Calculator.calculation(100, 50, '/');



//        проверяем утверждения, связанные с правильностью вычисления цены со скидкой
        assertThat(Calculator.calculatingDiscount(10000.0, 70)).isEqualTo(7000.0);
        assertThat(Calculator.calculatingDiscount(1500.0, 7)).isEqualTo(0.105);
        assertThat(Calculator.calculatingDiscount(100, 10)).isEqualTo(90);
        assertThat(Calculator.calculatingDiscount(20, 0)).isEqualTo(33);
//        проверяем утверждения, связанные с выбрасыванием ошибки
        // проверяем верхний предел скидки
        assertThatThrownBy(() -> Calculator.calculatingDiscount(330, 71))
                .isInstanceOf(ArithmeticException.class).hasMessage("Скидка в диапазоне от 0 до 70%");
        // проверяем что скидка не может быть отрицательной
        assertThatThrownBy(() -> Calculator.calculatingDiscount(1000, -50))
                .isInstanceOf(ArithmeticException.class).hasMessage("Скидка в диапазоне от 0 до 70%");
        // проверяем что сумма покупки не может быть отрицательной
        assertThatThrownBy(() -> Calculator.calculatingDiscount(-1000, 20))
                .isInstanceOf(ArithmeticException.class).hasMessage("Сумма покупки не бывает отрицательной");


    }
}
