package ChainOfResponsibilityDesignPattern;

import com.sun.source.tree.DirectiveTree;

public class ChainCreator {

    public Managers createChain(){
        HiringManager hiringManager = new HiringManager(1500000, "Eren Yeager");
        SeniorManager seniorManager = new SeniorManager(2500000, "Itachi Uchiha");
        Director director = new Director(3000000, "Vegeta");

        hiringManager.setManager(seniorManager);
        seniorManager.setManager(director);
        return hiringManager;
    }
}
