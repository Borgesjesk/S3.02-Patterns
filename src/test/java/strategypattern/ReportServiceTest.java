package strategypattern;

import org.junit.jupiter.api.Test;
import strategypattern.service.ReportService;
import strategypattern.strategy.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportServiceTest {
    @Test
    void testCsvReport() {
        ReportService service = new ReportService(new CsvReportStrategy());
        String result = service.generateReport("sales 2024");
        assertEquals("report, data: sales 2024", result);
    }

    @Test
    void testHtmlReport() {
        ReportService service = new ReportService(new HtmlReportStrategy());
        String result = service.generateReport("sales 2024");
        assertEquals("<html><body><p>sales 2024</p></body></html>", result);
    }

    @Test
    void testExcelReport() {
        ReportService service = new ReportService(new ExcelReportStrategy());
        String result = service.generateReport("sales 2024");
        assertEquals("Excel Report: sales 2024", result);
    }

    @Test
    void testJsonReport() {
        ReportService service = new ReportService(new JsonReportStrategy());
    String result = service.generateReport("sales 2024");
    assertEquals("{\"report\": \"sales 2024\"}", result);
    }

    @Test
    void testPdfReport() {
        ReportService service = new ReportService(new PdfReportStrategy());
        String result = service.generateReport("sales 2024");
        assertEquals("PDF Report: sales 2024", result);
    }

    @Test
    void testWordReport() {
        ReportService service = new ReportService(new WordReportStrategy());
        String result = service.generateReport("sales 2024");
        assertEquals("Word Report: sales 2024", result);
    }

    @Test
    void testXmlReport() {
        ReportService service = new ReportService(new XmlReportStrategy());
        String result = service.generateReport("sales 2024");
        assertEquals("<report>sales 2024</report>", result);
    }
}

