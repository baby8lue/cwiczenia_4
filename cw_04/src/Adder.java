import java.math.BigDecimal;
import java.util.List;

public class Adder {

    public static int add (int x, int y){return x+y;}
    public static BigDecimal add(List<BigDecimal> numbers) {
        BigDecimal sum = BigDecimal.valueOf(0);
        for (BigDecimal number : numbers) {
            sum = sum.add(number);
        }
        return sum;
    }
}
