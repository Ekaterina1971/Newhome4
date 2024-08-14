public class Main {
    public static void main(String[] args) {
        // Задача №1
        for (int a = 1; a <= 10; a ++) {
            System.out.println(a);
        }
        // задача №2
        for (int b = 10; b > 0; b --) {
            System.out.println(b);
        }
        // задача №3
        for (int c = 0; c < 17; c = c + 2) {
            System.out.println(c);
        }
        // задача №4
        for (int d = 10; d >= (-10); d --) {
            System.out.println(d);
        }
        // задача №5
        for (int year = 1904; year <= 2096; year = year +4) {
            System.out.println(year + " год является високосным");
        }
        // задача №6
        for (int i = 7; i <= 98; i = i+7) {
            System.out.println(i);
        }
        // задача №7
        for (int f = 1; f <= 512; f = f * 2) {
            System.out.println(f);
        }
        // задача №8
        int vklad = 29000;
        int summa = 0;
        for (int h = 1; h <= 12; h ++) {
            summa = summa + vklad;
            System.out.println(" Месяц " + h + ", сумма накоплений равна " + summa );
        }
        // задача №9
        int vklad1 = 29000;
        int summa1 = 0;
        for (int g = 1; g <= 12; g++) {
            summa1 = summa1 + (summa1 /  100);
            summa1 = summa1 + vklad1;
            System.out.println("Месяц " + g + ", сумма накоплений равна " + summa1 + " рублей");
        }
        // задача №10
        int m = 2;
        for (int n = 1; n <= 10; n ++) {
            int s = m * n;
            System.out.println(" 2 * 1 =" + s);
        }
    }
}