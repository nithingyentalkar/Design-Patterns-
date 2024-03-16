package FacadeDesignPattern;

public class LaptonSwtichOn {

    HardwareChecks hardwareChecks;
    SoftwareChecks softwareChecks;

    public LaptonSwtichOn() {
        this.hardwareChecks = new HardwareChecks();
        this.softwareChecks = new SoftwareChecks();
    }

    void SwitchOnLaptop(){
        if(hardwareChecks.CheckAllHardware() && softwareChecks.checkAllSoftware()==true) System.out.println("Laptop Switched ON :)");
        else System.out.println("Laptop could not switch ON :(");
    }
}
