public class Controller implements TeacherController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    
    private final TeacherView teacherView = new TeacherView();
    public create (String firstName, String lastName, String middleName){
        teacherService.createTeacher(firstName, lastName, middleName);
    }
}
