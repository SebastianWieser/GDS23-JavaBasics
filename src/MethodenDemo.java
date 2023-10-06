public class MethodenDemo {

    public static void main(String[] args) {




        printName("Sebastian Wieser");
        printName("Susi Sorglos");

        printName("Sebastian", "Wieser");

        String Sebastian = returnName("ftvihub","Sorglos");
        printName(Sebastian);




        printName(returnName("Susi","Sorglos"));

    }

    public static void printName (String name) {


        System.out.println(name);
    }

    public static void printName(String firstname, String lastname) {

        System.out.println(firstname + " " + lastname);
    }

    public static String returnName(String firstname, String lastname) {

        return "mein Name: " + firstname + " " + lastname;
    }
}
