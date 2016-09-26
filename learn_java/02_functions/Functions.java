
public class Functions {
    public static String hello() {
        return "hello";
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static double ftoc(double f) {
        return (f-32.0) * (5.0 / 9.0);
    }

    public static String[] makeArray(String s1, String s2, String s3) {
        String[] string = {s1, s2, s3};
        return string;
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
        }
        return sum;
    }

}
