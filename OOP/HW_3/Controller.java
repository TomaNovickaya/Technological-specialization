package Sem_3;

import java.util.List;

class Controller {
    private FlowService flowService;

    public Controller(FlowService flowService){
        this.flowService = flowService;
    }

    public void sortFlows (List<Flow> flows){
        flowService.sortFlows(flows);
    }
}
