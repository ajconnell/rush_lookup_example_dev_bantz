public interface ReportService {

    void mainMethod();

    void stepOne();

    void stepTwo();

    default void optionalStepThree() {
        // do fuck all
    }

    void stepFour();
}
