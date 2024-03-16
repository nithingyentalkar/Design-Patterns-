package FacadeDesignPattern;

public class SoftwareChecks {

    OperatingSystem operatingSystem;
    Driver driver;

    public SoftwareChecks() {
        this.operatingSystem = new OperatingSystem();
        this.driver = new Driver();
    }

    boolean checkAllSoftware(){
        return operatingSystem.OScheckOnBoot() && driver.driverCheckOnBoot();
    }
}
