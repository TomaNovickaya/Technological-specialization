package controller;

import model.Student;
import model.Study_Group;
import model.Type;
import service.Study_Group_Service;
import view.Student_View;

import java.util.List;

public class Controller {

    private final Study_Group_Service service = new Study_Group_Service();

    private final Student_View view = new Student_View();
    public void createStudent(String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<Study_Group> studyGroupList = service.getAllStudent();
        for (Study_Group study_group : studyGroupList) {
            Student student = (Student) study_group;
            view.printOnConsole(student);
        }
    }
}
