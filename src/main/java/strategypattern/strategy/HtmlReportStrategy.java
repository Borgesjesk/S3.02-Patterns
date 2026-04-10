package strategypattern.strategy;

public class HtmlReportStrategy  implements ReportStrategy{
    @Override
    public String generateReport(String data) {
        return "<html><body><p>"+data+"</p></body></html>";
    }
}
