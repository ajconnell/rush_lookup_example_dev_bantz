public class ExampleEndpoint {

    public LookupService lookupService = new LookupService();

    public static void main(String[] args) {

        // JUST MAKE BELIEVE THAT WHAT HAPPENS HERE OCCURS AFTER ONE OF TWO ENDPOINTS FIRES AN OBJECT AND AN ENUM
        // TO A COMMON SERVICE POINT THAT THEN FILTERS THROUGH
        System.out.println("Make believe endpoint been hit WITH PARAMETERS - going to defaultReportService");

        ExampleEndpoint e = new ExampleEndpoint();

        // Run Main Method for Service Returned
        e.lookupService.getReportServiceByEnum(ServiceIdentifier.FINAL_EXAMPLE).mainMethod();

    }

}
