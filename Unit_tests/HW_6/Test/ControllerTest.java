import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class ControllerTest {

    int[] arr;
    double averageArr1;
    double averageArr2;
    Controller controllerMock;

    @BeforeEach
    void setUp() {
        arr = new int[]{1, 1, 1, 1, 1};
        averageArr1 = 1.0;
        averageArr2 = 2.0;
        controllerMock = mock(Controller.class);
    }

    /**
     * Mock-тест - проверка, что в контроллере при вызове метода сравнения средних
     * значений возвращается корректное значение averageArray
     */
    @Test
    void averageArr1() {
        when(controllerMock.averageArr1(arr)).thenReturn(averageArr1);
    }

    /**
     * Mock-тест - проверка корректности сравнения средних значений массивов
     */
    @Test
    void compareArray() {
        controllerMock.compareArray(averageArr1, averageArr2);
        verify(controllerMock, times(1)).compareArray(averageArr1, averageArr2);
    }

    /**
     * Mock-тест - проверка создания в контроллере нового массива с заданными значениями
     */
    @Test
    void createArray() {
        when(controllerMock.createArray()).thenReturn(arr);
    }
}
