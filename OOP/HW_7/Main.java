public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        ViewCalculator view = new ViewCalculator();
        view.run();
        ViewCalculator viewCalc = new ViewCalculator();
        viewCalc.run();

    }
}
