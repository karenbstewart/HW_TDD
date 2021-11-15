import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void setUp(){
        printer = new Printer();
    }

    @Test
    public void addPaperToThePrinter(){
        printer.addPaperToPrinter(100);
        assertEquals(100, printer.getNumOfSheetsOfPaper());
    }

    @Test
    public void testIfCanPrint(){
        printer.addPaperToPrinter(100);
        assertEquals(true, printer.canPrint(50));
        assertEquals(false, printer.canPrint(150));
    }

    @Test
    public void testPrintSheet(){
        printer.addPaperToPrinter(100);
        printer.print(40);
        assertEquals(60, printer.getNumOfSheetsOfPaper());
        printer.print(70);
        assertEquals(60,printer.getNumOfSheetsOfPaper());
    }
}
