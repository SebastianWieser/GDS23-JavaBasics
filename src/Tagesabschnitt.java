public class Tagesabschnitt {

    public static void main(String[] args) {


        int Uhrzeit = 5;

        System.out.println("Es ist " + Uhrzeit + " Uhr " + Tageszeit(Uhrzeit));


    }

    public static String Tageszeit (int Zeit){

        if (Zeit >6 && Zeit <9){
            return "Früh";
        }

        if (Zeit >=9 && Zeit <12){
            return "Vormittag";
        }

        if (Zeit >=12 && Zeit <16){
            return "Nachmittag";
        }

        if (Zeit >=16 && Zeit <20){
            return "Abend";
        }

        if (Zeit >=20 && Zeit <24){
            return "Nacht";
        }

        if (Zeit >0 && Zeit <6){
            return "Nacht";
        }
        return "";
    }
}
