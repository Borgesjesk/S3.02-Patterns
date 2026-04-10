package strategypattern.strategy;

public class PdfReportStrategy implements ReportStrategy{
    @Override
    public String generateReport(String data) {
        return "PDF Report: "+ data;
    }
}
