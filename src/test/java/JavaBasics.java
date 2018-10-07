import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaBasics {
    private String text;

    @Test
    public void ourFirstTest() {

        Integer a = -5;
        Integer b = 105;
        Integer c = 88;
        Integer d = -333;

        text = "Your number is: ";

        sumAndPrint(a, b);
        sumAndPrint(c, d);

        Assertions.assertEquals(-245, a + d, "Wrong sum");

    }

    private void sumAndPrint(Integer a, Integer b) {

        Integer sum = a + b;
        System.out.println(text + sum);
    }
}
