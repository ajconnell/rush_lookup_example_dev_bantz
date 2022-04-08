abstract class AbstractReportService implements ReportService {

    public void mainMethod() {
        stepOne();
        stepTwo();
        optionalStepThree();
        stepFour();
    }

    public void stepOne() {
        System.out.println("1");
    }

    public void stepTwo() {
        System.out.println("2");
    }

    public void stepFour() {
        System.out.println("3");
    }

}
