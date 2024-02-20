package HW_6;

import java.util.ArrayList;
import java.util.List;
// Принцип инверсии зависимостей
public List<Teacher> getSortedTeacherByFIO() {
    List<Teacher> teacherList = new ArrayList<>(teacherGroup.getTeacherList());
    teacherList.sort(new UserComporator<Teacher>());
    return teacherList;
}

public void createTeacher(String firstName, String lastName, String middleName){
    teacherGroup.createTeacher(firstName, lastName, middleName);
}
