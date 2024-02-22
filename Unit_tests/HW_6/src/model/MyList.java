package model;
import java.util.Arrays;
import java.util.Random;

public class MyList implements List {

    public MyList() {
    }

    @Override
    public void compareArray(double resAverage1, double resAverage2) {
        if(resAverage1 == resAverage2) {
            System.out.println("Среднее значение списков равны: ");
        } else if (resAverage1 > resAverage2) {
            System.out.println("Первый список имеет большее среднее значение");
        } else {
            System.out.println("Второй список имеет большее среднее значение");
        }
    }

    @Override
    public double averageArray(int[] array) {
        double sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        double resAverage = Math.round(sum / array.length);
        System.out.println("\nСреднее значение списка = " + resAverage + ".\n");
        return resAverage;
    }

    public int[] createArray() {
       Random random = new Random();
       int[] array = random.ints(0, 100).distinct().limit(10).toArray();
       System.out.println(Arrays.toString(array));
       return array;
    }

}
