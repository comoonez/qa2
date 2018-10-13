import org.junit.jupiter.api.Test;

public class HomeWork1 {
    private String text = "After 30 years loaner will return: ";

    @Test
    public void calculation() {

        sumAndPrintResult(100556);
    }

    private void sumAndPrintResult(Integer loan) {
        double result1 = loan * 0.1;
        double result2 = loan * 0.08;
        double result3 = loan * 0.06;

        System.out.println(text + (result1 + result2 + result3 + loan));
    }
}
