public class TeacherView implements UserView<Teacher> {
    
    public void sendOnConsole (List<Teacher> list) {
        for (Teacher teacher: list) {
            System.out.System.out.println(teacher.getTeacherId());
        }
    }
}
