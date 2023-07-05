public class Celsius {
    public static void main(String[] args) {
        int celsius, fahr;
        int lower, upper, step;

        lower = 0;
        upper = 300;
        step = 30;

        fahr = lower;

        while (fahr <= upper) {
            celsius = 5 * (fahr - 32) / 9;
            System.out.printf("%d\t%d\n", fahr, celsius);
            fahr = fahr + step;
        }
    }
}