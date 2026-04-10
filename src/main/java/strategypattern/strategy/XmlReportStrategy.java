package strategypattern.strategy;

public class XmlReportStrategy implements ReportStrategy{
    @Override
    public String generateReport(String data) {
        return "<report>"+data+"</report>";
    }

}
