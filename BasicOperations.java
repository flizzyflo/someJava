

public class BasicOperations 
{
    public static Integer basicMath(String op, int v1, int v2) throws IllegalArgumentException
    {
        switch (op)
        {
            case "+":
            {
                return v1 + v2;
            }
            case "-":
            {
                return v1 - v2;
            }
            case "*":
            {
                return (int) v1 * v2;
            }
            case "/":
            {
                if (v2 == 0)
                {
                    throw new IllegalArgumentException("Division by 0");
                };
                return (int) v1 / v2;
            }
            default:
            return 0;
            
        }
    }
}
