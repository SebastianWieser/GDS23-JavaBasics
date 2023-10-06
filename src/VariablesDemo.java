public class VariablesDemo {

    public static void main(String[] args) {
        //Variablen deklarieren
        String firstName;
        long l;
        int a, b, c;

        //geht nicht da init fehlt
        // sout(a)

        //variablen intialisieren

        a = 1;
        b = 2;
        c = 3;

        l = 5;



        int d = 4;
        String lastName = "Wieser";
        int p = 3, q = 7;
        firstName = "Sebastian";

        //Datentyp tauschen möglich
        //firstName = 1

        l = a;

        b = 1;


        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(l);
        System.out.println(q);


        //var Datentyp

        var binEinVarint = 200;
        var binEinVarstring = "var als string";

        binEinVarint += 1;

        binEinVarint = binEinVarint+1;

        System.out.println(binEinVarint);


    }
}
