package HW_6;

import java.util.List;
//Принцип единой ответственности
public class TeacherView implements UserView<Teacher> {

    public void sendOnConsole (List<Teacher> list) {
        for (Teacher teacher: list) {
            System.out.println(teacher.getTeacherId());
        }
    }
}
