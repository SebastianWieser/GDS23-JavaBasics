public class CalculatorMethoden {

    public static void main(String[] args) {

        double Zahl1 = 5;

        double Zahl2 = 0;

        System.out.println("Ergebnis: " + addieren(Zahl1, Zahl2));
        System.out.println("Ergebnis: " + substrahieren(Zahl1, Zahl2));
        System.out.println("Ergebnis: " + smultiplizieren(Zahl1, Zahl2));
        System.out.println("Ergebnis: " + dividieren(Zahl1, Zahl2));


    }

    public static double addieren(double Zahl1, double Zahl2) {

        double result = Zahl1 + Zahl2;


        return result;


    }

    public static double substrahieren(double Zahl1, double Zahl2) {

        return Zahl1 - Zahl2;
    }

    public static double smultiplizieren(double Zahl1, double Zahl2) {

        return Zahl1 * Zahl2;
    }


            public static double dividieren(double Zahl1, double divisor) {

        if (divisor == 0)

        {return 0;}

        return Zahl1 / divisor;
    }

    public static void modulo(double Zahl1, double Zahl2) {

        System.out.println("Das Ergebnis lautet: " + Zahl1 % Zahl2);
    }

    public static void scope(int a) {

        {int b = 5;}

        int c = 6;

        {
            int b = 8;
        }

    }



}
