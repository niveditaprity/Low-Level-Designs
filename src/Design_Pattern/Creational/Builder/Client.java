package Design_Pattern.Creational.Builder;

public class Client {

    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new DesktopBuilder();
        ComputerDirector director = new ComputerDirector(computerBuilder);
        Computer computer = director.buildComputer();
        System.out.println(computer.toString());



    }
}
