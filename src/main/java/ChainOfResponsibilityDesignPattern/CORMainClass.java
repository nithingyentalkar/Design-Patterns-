package ChainOfResponsibilityDesignPattern;

public class CORMainClass {
    public static void main(String[] args) {
        ChainCreator chainCreator = new ChainCreator();
        Managers manager = chainCreator.createChain();
        manager.approveSalary(70000);
        manager.approveSalary(4500000);
        manager.approveSalary(2700000);
        manager.approveSalary(2000000);

    }
}
