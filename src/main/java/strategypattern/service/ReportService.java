package strategypattern.service;

import strategypattern.strategy.ReportStrategy;

public class ReportService {

    private final ReportStrategy strategy;

    public ReportService(ReportStrategy strategy) {
        this.strategy = strategy;
    }

    public String generateReport(String data) {
        return strategy.generateReport(data);
    }

}
