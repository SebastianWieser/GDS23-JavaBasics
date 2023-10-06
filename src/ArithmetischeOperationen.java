public class ArithmetischeOperationen {

    public static void main(String[] args) {


        int a = 6;

        int b = 9;

        int result;

        result = a + b ;

        System.out.println("result addition: " + ( a + b));
        System.out.println("result sub: " + ( a - b));
        System.out.println("result mult: " + ( a * b));
        System.out.println("result div: " + ( a / b));
        System.out.println("result mod: " + ( a % b));


        double div = a/ (b * 1.0);
        System.out.println("div = " + div);

        System.out.println("a = " + a);
        System.out.println(a++);
        System.out.println("a = " + a);
        System.out.println(a++);
        System.out.println("a = " + a);

        String Haus1 = "Haus";
        String Haus2 = "Haus";

        System.out.println(Haus1==Haus2);  //falsche Version

        System.out.println(Haus1.equals(Haus2));







    }
}
