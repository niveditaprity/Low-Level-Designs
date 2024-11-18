package SOLID_Principle.ISP.With;

class BasicPrinter implements Printable {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}
