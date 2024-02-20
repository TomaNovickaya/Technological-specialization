package HW_6;

import java.util.List;
// Принцип единой ответственности
public interface UserView<T extends User> {

    void sendOnConsole(List<T> list);
}
