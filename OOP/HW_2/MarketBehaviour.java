package Sem_2.zad_1;

public interface MarketBehaviour<T> {
    void inOrder (T order);
    T outOrder();
}
