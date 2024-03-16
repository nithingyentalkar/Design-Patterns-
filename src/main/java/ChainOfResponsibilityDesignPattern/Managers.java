package ChainOfResponsibilityDesignPattern;

public abstract class Managers {
    protected Managers manager;
     int approvalLimit;
     String ManagerName;

    public void setManager(Managers manager){
        this.manager = manager;
    }
    public void approveSalary(int employeeSalary){
        if(approvalLimit>employeeSalary){
            processSalary(employeeSalary);
        }else if(manager!=null) manager.approveSalary(employeeSalary);
        else System.out.println("Candidate Rejected as the budget of the company could not meet the candidate's expectation");
    }

    protected abstract void processSalary(int employeeSalary);
}
