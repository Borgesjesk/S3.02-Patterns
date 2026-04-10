package strategypattern.strategy;

public class JsonReportStrategy implements ReportStrategy {
    @Override
    public String generateReport(String data) {
        return "{\"report\": \"" + data + "\"}";
    }
}
