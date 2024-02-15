package service;

import model.Student;
import model.Study_Group;
import model.Teacher;
import model.Type;

import java.util.ArrayList;
import java.util.List;

public class Study_Group_Service {

    private List<Study_Group> studygroupsList;

    public void create (String firstName, String lastName, String middleName, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            Student student = new Student(firstName, lastName, middleName, id);
            studygroupsList.add(student);
        }
        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(firstName, lastName, middleName, id);
            studygroupsList.add(teacher);

        }
    }

    public Study_Group getStudyGroup(Type type, int id) {
        boolean itsStudent = Type.STUDENT == type;
        Study_Group currentStudyGroup = null;
        for (Study_Group studyGroup : studygroupsList) {
            if (studyGroup instanceof Teacher && !itsStudent && ((Teacher) studyGroup).getTeacherId() == id) {
                currentStudyGroup = studyGroup;
            }
            if (studyGroup instanceof Student && itsStudent && ((Student) studyGroup).getStudentId() == id) {
                currentStudyGroup = studyGroup;
            }
        }
        return currentStudyGroup;
    }

    public List<Study_Group> getAllStudyGroup(){
        return studygroupsList;
    }

    public List<Study_Group> getAllStudent(){
        List<Study_Group> students = new ArrayList<>();
        for(Study_Group study_group : studygroupsList){
            if (study_group instanceof  Student) {
                students.add(study_group);
            }
        }
        return students;
    }
    private int getFreeId(Type type){
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for (Study_Group studyGroup : studygroupsList) {
            if (studyGroup instanceof Teacher && !itsStudent) {
                lastId = ((Teacher) studyGroup).getTeacherId() + 1;
            }
            if (studyGroup instanceof Student && itsStudent) {
                lastId = ((Student) studyGroup).getStudentId() +1;
            }
        }
        return lastId;
    }
}
