package HW_6;

// Принцип единой ответственности
public interface TeacherController<T extends User> {
    void create (String firstName, String lastName, String middleName);
}
