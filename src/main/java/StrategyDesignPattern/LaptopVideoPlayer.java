package StrategyDesignPattern;

public class LaptopVideoPlayer extends VideoPlayer{

    public LaptopVideoPlayer(Device device, Resolution resolution) {
        this.currentDevice = device;
        this.currentResolution = resolution;
    }

    @Override
    void display() {
    this.getDevice();
    this.getResolution();
    }
}
