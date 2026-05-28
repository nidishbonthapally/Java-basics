public class OfficePrinter implements Printable,Scannable {
    private String printerName;
    private int pageCount;
    private int resolution;

    public OfficePrinter(String printerName, int pageCount, int resolution){
        this.pageCount=pageCount;
        this.printerName=printerName;
        this.resolution=resolution;
    }

    public void printDocument(String docName) {
        System.out.println("The document "+docName+ " is being printed by "+printerName);
    }

    @Override
    public void printPageCount() {
        System.out.println("Page count: "+pageCount);
    }

    public int getPageCount() {
        return pageCount;
    }

    public void scanDocument(String docName) {
        System.out.println("The document "+docName+ " is being scanned by "+printerName);
    }

    @Override
    public void printResolution() {
        System.out.println("Resolution: "+resolution);
    }

    public int getResolution() {
        return resolution;
    }

    public String getPrinterName() {
        return printerName;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

}
