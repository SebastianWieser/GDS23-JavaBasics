public class CalculatorMethoden {

    public static void main(String[] args) {

        double Zahl1 = 5;

        double Zahl2 = 8;

        System.out.println("Ergebnis: " + addieren(Zahl1,Zahl2));
        System.out.println("Ergebnis: " + substrahieren(Zahl1,Zahl2));
        System.out.println("Ergebnis: " + smultiplizieren(Zahl1,Zahl2));
        System.out.println("Ergebnis: " + dividieren(Zahl1,Zahl2));
        System.out.println("Ergebnis: " + modulo(Zahl1,Zahl2));








    }

    public static double addieren(double Zahl1, double Zahl2){

        double result = Zahl1 + Zahl2;



        return result;



    }

    public static double substrahieren(double Zahl1, double Zahl2){

        return Zahl1 - Zahl2;
    }

    public static double smultiplizieren(double Zahl1, double Zahl2){

        return Zahl1 * Zahl2;}


    public static double dividieren(double Zahl1, double Zahl2){

        return Zahl1 / Zahl2;}

    public static double modulo(double Zahl1, double Zahl2){

        return Zahl1 % Zahl2;}
}
