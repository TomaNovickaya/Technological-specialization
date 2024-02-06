public interface TeacherController<T extends User> {
    void create (String firstName, String lastName, String middleName);
}
