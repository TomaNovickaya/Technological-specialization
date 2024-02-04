package Sem_3;

class StreamComparator {
    public int compare(Flow flow1, Flow flow2){
        int coutGroup1 = flow1.cout();
        int coutGroup2 = flow2.cout();

        return Integer.compare(coutGroup1, coutGroup2);
    }
}
