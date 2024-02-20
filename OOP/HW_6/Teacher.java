package HW_6;

// Принцип открытия/закрытия

public class Teacher extends User implements Comparable<Teacher>{
    private Long teacherId;

    public Teacher(String firstName, String lastName, String middleName){
        super(firstName, lastName, middleName);
    }

    public Long getTeacherId(){
        return teacherId;
    }

    public void setTeacherId(Long teacherId){
        this.teacherId = teacherId;
    }

    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
}
