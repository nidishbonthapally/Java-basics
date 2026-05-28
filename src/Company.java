public class Company {
    public static void main(String[] args) {
    OfficePrinter p = new OfficePrinter("HP deskjet",13,1080);
    Printable print = new OfficePrinter("HP Inkjet", 21, 480);
    Scannable scan = new OfficePrinter("HP Inkjet", 21, 480);
    print.printPageCount();
    scan.printResolution();
    print.printDocument("Resume");
    scan.scanDocument("Resume");
    }
}
