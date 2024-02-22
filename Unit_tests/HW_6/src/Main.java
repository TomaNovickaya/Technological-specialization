public class Main {

    public static void main(String[] args){

        Controller controller = new Controller();

        int[] arr1 = controller.createArray();
        double averageArr1 = controller.averageArr(arr1);

        int[] arr2 = controller.createArray();
        double averageArr2 = controller.averageArr(arr2);

        controller.compareArray(averageArr1, averageArr2);
    }
}
