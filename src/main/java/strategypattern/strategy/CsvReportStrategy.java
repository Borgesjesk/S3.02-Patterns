package strategypattern.strategy;

public class CsvReportStrategy implements ReportStrategy {
    @Override
    public String generateReport(String data) {
        return "report, data: "+data;
    }
}
