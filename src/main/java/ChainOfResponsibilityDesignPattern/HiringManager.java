package ChainOfResponsibilityDesignPattern;

public class HiringManager extends Managers {
    public HiringManager(int approvalLimit, String ManagerName) {
        this.approvalLimit = approvalLimit;
        this.ManagerName = ManagerName;
    }

    @Override
    protected void processSalary(int employeeSalary) {
        System.out.println(this.ManagerName + " has approved the Candidate at level 1 with the salary of " + employeeSalary);
    }
}
