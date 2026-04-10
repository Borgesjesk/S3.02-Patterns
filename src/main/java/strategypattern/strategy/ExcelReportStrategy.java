package strategypattern.strategy;

public class ExcelReportStrategy implements ReportStrategy{
    @Override
    public String generateReport(String data) {
        return "Excel Report: "+ data;
    }
}
