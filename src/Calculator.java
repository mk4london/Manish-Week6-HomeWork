public class Calculator {

    void Addition() {
        int a = 10;
        int b = 20;
        System.out.println("Addition" + ":-" + "10" + "+" + "20" + "=" + a + b);
    }

    void Subtraction() {
        int c = 20;
        int d = 30;
        System.out.println("Subtraction" + ":-" + "30" + "-" + "20" + "=" + (c - d));

    }

    static void Multiplication() {
        int e = 10;
        int f = 20;
        System.out.println("Multiplication" + ":-" + "10" + "*" + "20" + "=" + e * f);

    }

    static void Division() {
        int g = 30;
        int h = 10;
        System.out.println("Division" + ":-" + "30" + "/" + "10" + "=" + g / h);

    }

    public static void main(String[] args) {
        Calculator a = new Calculator();
        a.Addition();
        a.Subtraction();
        Multiplication();
        Division();
    }
}


