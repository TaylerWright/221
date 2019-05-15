// name:Tayler Wright
// Look at the following interface.



public class lambdaExpression{

    public interface Computable
    {
        double compute(double x);
    }

    public static void main(String[] args) {

        //implements computable interface which returns half value of x
        Computable half = (x) -> (x/2);

        System.out.println(half.compute(10));
    }
}
