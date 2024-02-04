package Sem_3;

import java.util.ArrayList;
import java.util.List;



class Flow implements Iterable<StudyGroup>{
    private List<StudyGroup> groups;

    public Flow(){
        groups = new ArrayList<>();
    }

    public void addGroup(StudyGroup group){
        groups.add(group);
    }

    @Override
    public java.util.Iterator<StudyGroup> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

   
}
