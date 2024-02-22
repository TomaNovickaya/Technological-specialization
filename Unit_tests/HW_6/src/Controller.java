import model.MyList;

public class Controller {
    MyList myList;

    public Controller(){
        this.myList = new MyList();
    }

    public double averageArray(int[] array) {
        return myList.averageArray(array);
    }

    public void compareArray(double resAverage1, double resAverage2){
        myList.compareArray(resAverage1, resAverage2);
    }

    public int[] createArray() {
        return myList.createArray();
    }
}
