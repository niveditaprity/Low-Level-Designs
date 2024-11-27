package Design_Pattern.Creational.Builder;

//concrete Builder
public class DesktopBuilder  implements  ComputerBuilder{
    public Computer computer;

    DesktopBuilder() {
        this.computer = new Computer();
    }
    @Override
    public void buildProcessors() {
        this.computer.setProcessors("Intel i5");


    }

    @Override
    public void buildMemory() {
        this.computer.setMemory("64GB");

    }

    @Override
    public void buildDisplay() {
        this.computer.setDisplay("24*50");

    }

    @Override
    public void buildGPU() {
        this.computer.setGPU("GPU890");


    }

    @Override
    public void buildOS() {
        this.computer.setOS("MAC");

    }

    @Override
    public void buildStorage() {
        this.computer.setStorage("1TB");

    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
