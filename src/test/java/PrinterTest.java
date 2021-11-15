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
}
