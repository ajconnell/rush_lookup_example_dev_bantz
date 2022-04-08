public class LookupService {

    private DefaultReportService defaultReportService= new DefaultReportService();
    private AlternativeReportService alternativeReportService = new AlternativeReportService();
    private FinalExampleReportService finalExampleReportService = new FinalExampleReportService();

    public ReportService getReportServiceByEnum(ServiceIdentifier serviceIdentifier) {
        if (serviceIdentifier.equals(ServiceIdentifier.DEFAULT)) {
            return defaultReportService;
        }
        if (serviceIdentifier.equals(ServiceIdentifier.ALTERNATIVE)) {
            return alternativeReportService;
        }
        if (serviceIdentifier.equals(ServiceIdentifier.FINAL_EXAMPLE)) {
            return finalExampleReportService;
        }
        return null;
    }

}
