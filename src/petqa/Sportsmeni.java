package petqa;

public class Sportsmeni {
    public static void main(String[] args) {

        Sportsmen S1 = new Sportsmen();
        S1.Anun = "Gor";
        S1.Azganun = "Margaryan";
        S1.Tariq = 23;
        S1.Qaxaq = "Echmiadzin";
        S1.Andznakan_qash = 73.9f;

       Sportsmen S2 = new Sportsmen();
        S2.Anun = "Jozef";
        S2.Azganun = "Tigranyan";
        S2.Tariq = 22;
        S2.Qaxaq = "Echmiadzin";
        S2.Andznakan_qash = 71.8f;


        S1.Tvyalner();
        S2.Tvyalner();

    }
}
