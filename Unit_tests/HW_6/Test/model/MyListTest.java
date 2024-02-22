package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class MyListTest {
    int[] arr1;
    int[] arr2;
    int[] arr3;
    MyList mylist;
    MyList mylistMock;
    double averageArr1;
    double averageArr2;

    @BeforeEach
    void setUp() {
        mylist = new MyList();
        mylistMock = mock(MyList.class);
        arr1 = new int[]{1,2,3,7,1};
        arr2 = new int[]{2,1,3,1,5};
        arr3 = new int[]{1,2,1,3,4};
        averageArr1 = 1.0;
        averageArr2 = 2.0;
    }

    /**
     * Mock-тест - проверка метода сравнения средних значений двух списков (средние значения равны)
     */
    @Test
    void compareArray() {
        double average1 = mylist.averageArr1(arr2);
        double average2 = mylist.averageArr1(arr1);
        mylist.compareArray(average1, average2);
    }

    /**
     * Unit, Mock-тест - проверка метода вычисления среднего значения списка
     */
    @Test
    void averageArray() {
        assertThat(mylist.averageArr1(arr3)).isEqualTo(2.0);
        //проверка с помощью Mock
        when(mylistMock.averageArr1(arr3)).thenReturn(averageArr);
    }

    /**
     *  Unit, Mock-тест - проверка метода создания списка
     */
    @Test
    void createArray() {
        //проверка на ограничение длины списка равное 10
        assertThat(mylist.createArray().length).isEqualTo(10);
        //проверка с помощью Mock
        when(mylistMock.createArray()).thenReturn(arr3);
    }

    /**
     * Mock-тест - проверка создания нового списка в классе MyList
     */
    @Test
    void createMyList(){
        when(mylistMock.createArray()).thenReturn(new int[]{1,2,3,7,1});
    }
}
