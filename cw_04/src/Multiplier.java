import java.math.BigDecimal;

public class Multiplier {

    public static int multiply(int x, int y ){
        return x * y;
    }

    public static int multiply(int x, int y, int z, int q){
        return multiply(x,y)* z* q;
    }
    public static double multiply(double x, double y){return x*y;}

    public static BigDecimal multiply(BigDecimal x, BigDecimal y){return x.multiply(y);}

}
