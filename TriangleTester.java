public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c)
    {
        boolean first, second, third;
        first = a + b > c;
        second = a + c > b;
        third = b + c > a;
        return first && second && third;
    };
}
