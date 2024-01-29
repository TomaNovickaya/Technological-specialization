package Sem_2.zad_1;

public class Main {
    public static void main(String[] args) {
        Market <String> market = new Market<>();

        market.inQueue("person1");
        market.inQueue("person2");
        market.inQueue("person3");

        market.update();
        market.update();
        market.update();
        market.update();

    }
}
