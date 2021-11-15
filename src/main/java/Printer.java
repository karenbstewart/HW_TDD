public class Printer {

    private int numOfSheetsOfPaper;

    public Printer(){
        this.numOfSheetsOfPaper = 0;
    }

    public int getNumOfSheetsOfPaper(){
        return this.numOfSheetsOfPaper;
    }

    public void setNumOfSheetsOfPaper(int newTotalNumber){
        this.numOfSheetsOfPaper = newTotalNumber;
    }

    public void addPaperToPrinter(int numOfSheets) {
        setNumOfSheetsOfPaper(numOfSheets);
    }
}
