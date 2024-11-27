package Design_Pattern.Creational.Builder;

//Builder
interface  ComputerBuilder {
    void buildProcessors();
    void buildMemory();
    void buildStorage();
    void buildOS();
    void buildGPU();
    public void buildDisplay();
    Computer getComputer();



}
