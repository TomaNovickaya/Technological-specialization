package HW_6;
// Принцип открытия/закрытия
public class Controller implements TeacherController<Teacher> {
    private final TeacherService teacherService = new TeacherService();

    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);
    }
}
