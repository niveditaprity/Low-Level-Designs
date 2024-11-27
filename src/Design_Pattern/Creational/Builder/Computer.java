package Design_Pattern.Creational.Builder;

//Product
public class Computer {
    private String Processors;
    private String memory;
    private String Storage;
    private String OS;
    private String GPU;
    private String Display;

    public String getDisplay() {
        return Display;
    }

    public String getGPU() {
        return GPU;
    }

    public String getMemory() {
        return memory;
    }

    public String getOS() {
        return OS;
    }

    public String getProcessors() {
        return Processors;
    }

    public String getStorage() {
        return Storage;
    }

    public void setDisplay(String display) {
        Display = display;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setProcessors(String processors) {
        Processors = processors;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }

    @Override
    public String toString() {
        return "Computer [RAM=" + memory + ", Storage=" + Storage +
                ", Graphics Card=" + GPU + ", Operating System=" + OS + "]";
    }
}
