package ChainOfResponsibilityDesignPattern;

public class SeniorManager extends Managers{
    public SeniorManager(int approvalLimit, String ManagerName) {
        this.approvalLimit = approvalLimit;
        this.ManagerName = ManagerName;
    }

    @Override
    protected void processSalary(int employeeSalary) {
        System.out.println(this.ManagerName + " has approved the Candidate at level 2 with the salary of " + employeeSalary);
    }
}
