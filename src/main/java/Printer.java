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

    public boolean canPrint(int numToPrint) {
        if (this.numOfSheetsOfPaper >= numToPrint) {
            return true;
        } else {
            return false;
        }
    }

    public void print(int numOfPagesToPrint){
        if (canPrint(numOfPagesToPrint) == true){
            int currentNumSheets =  getNumOfSheetsOfPaper();
            int numToPrint = numOfPagesToPrint;
            int remaining = currentNumSheets - numToPrint;
            setNumOfSheetsOfPaper(remaining);
        }
    }



}
