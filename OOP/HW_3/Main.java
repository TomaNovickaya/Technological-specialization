package Sem_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        StudyGroup group1 = new StudyGroup(1);
        StudyGroup group2 = new StudyGroup(2);
        StudyGroup group3 = new StudyGroup(3);

        Flow flow1 = new Flow();

        flow1.addGroup(group1);
        flow1.addGroup(group2);

        Flow flow2 = new Flow();
        flow2.addGroup(group3);

        FlowService flowService = new FlowService();

        Controller controller = new Controller(flowService);

        List<Flow> flows = new ArrayList<>();
        flows.add(flow1);
        flows.add(flow2);
        controller.sortFlows(flows);

        for (Flow flow: flows){
            System.out.println("Flow: ");
            for (StudyGroup group: flow){
                System.out.println("- " + group.getNum());
            }
        }

    }
}
