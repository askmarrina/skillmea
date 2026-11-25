import java.util.Locale;
import java.util.Random;
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

        /*
        // vylepsena kalkulacka
        Scanner mojScanner = new Scanner(System.in);
        System.out.println("Zadaj prve cislo:");
        int prvniCislo = mojScanner.nextInt();
        System.out.println("Zadaj druhe cislo:");
        int druheCislo = mojScanner.nextInt();
        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo / druheCislo);
        */

        /*
        // String metody
        String mojText = "Hello World";
        System.out.println(mojText.indexOf('W'));
        */

        /*
        // Prevadeni mezi typy
        String textoveCislo = "5";
        int prevedeneCislo = Integer.parseInt(textoveCislo);
        System.out.println(prevedeneCislo);
        */

        /*
        // Matematicke operace
        int prveCislo = 17;
        int druheCislo = 5;
        System.out.println(17 % 5);
        */

        // Podminky a vetveni
        /*
        Scanner mojScanner = new Scanner(System.in);
        System.out.println("Zadaj prve cislo:");
        int prveCislo = mojScanner.nextInt();

        if(prveCislo > 8) {
            System.out.println("Cislo je viac ako 8");
        }else if (prveCislo == 8) {
            System.out.println("Cislo je rovno 8");
        }
        else {
            System.out.println("Cislo je menej ako 8");
        }

         */

        /*Scanner mojScanner = new Scanner(System.in);
        System.out.println("Zadaj prve cislo:");
        int prveCislo = mojScanner.nextInt();

        if(prveCislo > 8 || prveCislo < 0) {
            System.out.println("Cislo je medzi 0 a 8 vcetne");
        }*/

        /*
        Scanner mojScanner = new Scanner(System.in);
        System.out.println("Zadaj vek:");
        int vek = mojScanner.nextInt();

        if(vek >= 18) {
            System.out.println("Uzivatel je dospely");
        } else if (vek >= 65) {
            System.out.println("Uzivatel je senior");
        } else {
            System.out.println("Uzivatel nema pristup");
        }

         */

        /*
        // vypocet BMI
        float vyska;
        float vaha;
        float bmi;
        Scanner mojScanner = new Scanner(System.in);

        System.out.println("Zadaj vysky v metrech:");
        vyska = mojScanner.nextFloat();
        System.out.println("Zadaj vahu v kilogramoch:");
        vaha = mojScanner.nextFloat();

        bmi = vaha / (vyska * vyska);
        System.out.println(bmi);
        if(bmi < 18.5f) {
            System.out.println("Uzivatel ma podvahu");
        } else if (bmi >= 18.5f && bmi <= 25f) {
            System.out.println("Uzivatel ma normalnu hmotnost");
        } else if (bmi >= 25f) {
            System.out.println("Uzivatel ma nadvahu");
        } else {
            System.out.println("Nelze zadat zapornou hmotnost");
        }
        */

        /*
        // Hod kostkou suda vyhravas, licha prohravas
        Random nahodnyGenerator = new Random();
        int hodKostkou;
        hodKostkou = nahodnyGenerator.nextInt(1, 7);
        System.out.println("Hozene cislo: " + hodKostkou);
        if(hodKostkou % 2 == 0) {
            System.out.println("Cislo je sude, vyhravas");
        } else  {
            System.out.println("Cislo je liche, prohravas");
        }
        */

/*
        // switch - vyber dne
        Scanner mojScanner = new Scanner(System.in);
        int cisloDne;
        System.out.println("Zadaj cislo dne:");
        cisloDne = mojScanner.nextInt();
        switch(cisloDne) {
            case 1:
                System.out.println("Je pondelok");
                break;
            case 2:
                System.out.println("Je utorok");
                break;
            case 3:
                System.out.println("Je streda");
                break;
            case 4:
                System.out.println("Je stvrtok");
                break;
            case 5:
                System.out.println("Je piatok");
                break;
            case 6:
                System.out.println("Je sobota");
                break;
            case 7:
                System.out.println("Je nedela");
                break;

        }
        */

        // Pole
        /*
        int[] znamky = new int[5]; // будет 5 элементов в массиве
        znamky[0] = 3;
        znamky[1] = 5;
        znamky[2] = 1;
        znamky[3] = 4;
        znamky[4] = 1;

        // int[] znamky2 = new int[] {3, 4, 5, 2, 1}; тоже создание массива
        System.out.println(znamky);
        */

        /*
        String[] jmenaStudentov = new String[] {"Honza", "Lenka", "Petra", "Peter", "Jolana"};
        System.out.println(jmenaStudentov[3] + jmenaStudentov[4]);
        System.out.println(jmenaStudentov[3].toUpperCase());
        System.out.println(jmenaStudentov[3].length());
        */

        /*
        int[][] viceDimPole = new int[2][2]; // 2 массива с 2 элементами
        viceDimPole[0][0] = 83; // в первом массиве, первый элемент
        */

        System.out.println("Hello world");

    }
}