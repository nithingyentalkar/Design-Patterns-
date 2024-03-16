package ChainOfResponsibilityDesignPattern;

public class Director extends Managers{

    public Director(int approvalLimit, String ManagerName) {
        this.approvalLimit = approvalLimit;
        this.ManagerName = ManagerName;
    }

    @Override
    protected void processSalary(int employeeSalary) {
        System.out.println(this.ManagerName + " has approved the Candidate at level 3 with the salary of " + employeeSalary);
    }
}
