package FacadeDesignPattern;

public class HardwareChecks {

    MotherBoard motherBoard;
    RAM ram;

    public HardwareChecks() {
        this.motherBoard = new MotherBoard();
        this.ram = new RAM();
    }

    boolean CheckAllHardware(){
        return motherBoard.motherBoardCheckOnBoot() && ram.RAMcheckOnBoot();
    }
}
