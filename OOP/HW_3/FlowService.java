package Sem_3;

import java.util.List;

class FlowService  {
    public void sortFlows(List<Flow> flows){
       flows.sort(new StreamComparator()); 
    }
    
}
