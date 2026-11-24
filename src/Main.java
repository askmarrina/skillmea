import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /* toto
        je
        viaceroriadkovy
        komentar
        */

        /*
        String pozdrav = "Hello Marina";
        String jmeno = "Od Honzy";
        jmeno = "od Jana";


        System.out.println(pozdrav + jmeno); // another comment
        System.out.println("Hello World"); // another comment

         */


        // Kalkulacka
        /*
        int prveCislo = 20;
        int druheCislo = 5;
        System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(prveCislo * druheCislo);
        System.out.println(prveCislo / druheCislo);

        boolean pravdaNepravda = true;

        float desCislo1 = 3.1434f;
        float desCislo2 = 0.2f;
        System.out.println(desCislo1 + desCislo2);
        */

        // vylepsena kalkulacka
        Scanner mojScanner = new Scanner(System.in);
        System.out.println("Zadaj prve cislo:");
        int prvniCislo = mojScanner.nextInt();
        System.out.println("Zadaj druhe cislo:");
        int druheCislo = mojScanner.nextInt();
        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo / druheCislo);



    }
}