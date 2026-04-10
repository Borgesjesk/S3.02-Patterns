package strategypattern.strategy;

public class WordReportStrategy implements ReportStrategy{
    @Override
    public String generateReport(String data) {
        return "Word Report: "+ data;
    }
}
