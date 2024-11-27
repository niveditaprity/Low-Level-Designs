package Design_Pattern.Creational.Builder;


public class ComputerDirector {
    public ComputerBuilder computerBuilder;
    ComputerDirector(ComputerBuilder builder) {
        this.computerBuilder = builder;
    }

    public Computer buildComputer() {
        computerBuilder.buildProcessors();
        computerBuilder.buildOS();
        computerBuilder.buildDisplay();
        computerBuilder.buildGPU();
        computerBuilder.buildStorage();
        computerBuilder.buildMemory();
        return computerBuilder.getComputer();
    }
}
