package Sem_2.zad_1;


import java.util.LinkedList;
import java.util.Queue;

public class Market<T> implements QueueBehaviour<T>,MarketBehaviour<T> {
    private Queue<T> queue; // Очередь
    private T currentOrder; // Текущий заказ

    public Market() {
        queue = new LinkedList<>();
    }     
    
    public void inQueue(T person) {
        queue.add(person);
    }

    @Override
    public T outQueue() {
        return queue.poll();
    }


    @Override
    public void inOrder(T order) {
        if (currentOrder == null) {
            currentOrder = order;
            System.out.println("Заказ принят: " + order);
        } else {
            System.out.println("Заказ уже в обработке.");
        }
    }

    @Override
    public T outOrder() {
        if (currentOrder != null) {
            T completedOrder = currentOrder;
            currentOrder = null;
            System.out.println("Заказ выполнен: " + completedOrder);
            return completedOrder;
        } else {
            System.out.println("Нет текущего заказа для выполнения.");
            return null;
        }
    }

}
