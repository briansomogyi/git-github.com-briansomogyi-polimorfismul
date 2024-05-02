package GhiseulDeIncasari;

import java.util.ArrayList;
import java.util.Scanner;

public class GhiseulDeIncasari {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduceti contribuabilul: ");
            System.out.print("Introduceti numele: ");
            String nume = scanner.nextLine();
            System.out.print("Introduceti cnpul: ");
            String cnp = scanner.nextLine();
            Contribuabil contribuabil = new Contribuabil(nume, cnp);
            System.out.println("Introduceti proprietatea: ");
            System.out.println("Introduceti adresa: ");
            System.out.print("Introduceti strada: ");
            String adresa = scanner.nextLine();
            System.out.print("Introduceti numarul: ");
            int nr = scanner.nextInt();
            String string = scanner.nextLine();
            Adresa adresa2 = new Adresa(adresa, nr);
            System.out.print("Introduceti suprafata: ");
            int suprafata = scanner.nextInt();
            String string2 = scanner.nextLine();
            Proprietate proprietate = new Cladire(adresa2, suprafata);
            ArrayList<Proprietate> list = new ArrayList<>();
            list.add(proprietate);
            Fluturas fluturas = new Fluturas(contribuabil, list);
            try {
                fluturas.setSumaTotala(fluturas.calculeazaSumaTotala());
                contribuabil.setDePlatit(fluturas.getSumaTotala());
            } catch (Exception e) {
                try {
                    contribuabil.setDePlatit(fluturas.calculeazaSumaTotala());
                } catch (Exception e2) {
                    contribuabil.setDePlatit(proprietate.calculeazaCost());
                }
            }
            Operator operator = new Operator(fluturas);
            System.out.println(operator);
        }
    }
}
