package Sem_2.zad_1;

public void update() {
    if (currentOrder == null && !queue.isEmpty()) {
        T nextOrder = outqueue();
        acceptOrder(nextOrder);
    }
}
