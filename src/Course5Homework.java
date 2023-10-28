import java.util.Random;

public class Course5Homework {
    public static void main(String[] args) {
        int[] numere = {1 ,2 ,3 ,4 ,5 ,6 ,7};
        int nrDeComparat = 3;
        int suma = sumaNrIntregi(numere);
        int nrImpare = nrElemImpare(numere);
        int[] nrMaiMari = nrMaiMari(numere, nrDeComparat);
        int sumaTinta = 1000;
        int nrMaximDonatii = 10;
        donatii(sumaTinta, nrMaximDonatii);

        String fraza = "Ana are mere. Cainele alearga. Ziua este frumoasa.";

        String[] propozitii = afisPropozitii(fraza);
        for (String propozitie : propozitii) {
            System.out.println(propozitie);

        }

        System.out.println("Suma nr. este: " + suma);
        System.out.println("Nr. de elem. impare este: " + nrImpare);
        System.out.print("Nr. mai mari decat " + nrDeComparat + " sunt: ");
        for (int numar : nrMaiMari) {
            System.out.println(numar + " ");
        }
    }

    //1
    public static int sumaNrIntregi(int[] numere) {
        int suma = 0;

        for (int numar : numere) {
            suma += numar;
        }
        return suma;
    }
    //2
    public static int nrElemImpare(int[] numere) {
        int nrElemImpare = 0;

        for (int numar : numere) {
            if (numar % 2 != 0) {
                nrElemImpare++;
            }
        }
        return nrElemImpare;
    }
    //3
    public static int[] nrMaiMari(int[] numere, int nrDeComparat) {
        int nrMaiMari = 0;

        for (int numar : numere) {
            if (numar > nrDeComparat) {
                nrMaiMari++;
            }
        }
        int[] rezultat = new int[nrMaiMari];
        int index = 0;

        for (int numar : numere) {
            if (numar > nrDeComparat) {
                rezultat[index] = numar;
                index++;
            }
        }
        return rezultat;
    }
    //4, 5
    public static void donatii(int sumaTinta, int nrMaximDonatii) {
        Random random = new Random();
        int sumaTotala = 0;
        int nrDonatii = 0;
        while (sumaTotala < sumaTinta && nrDonatii < nrMaximDonatii) {
            int donatie = random.nextInt(100);
            sumaTotala += donatie;
            nrDonatii++;
            System.out.println("Donatie #" + nrDonatii + ": " + donatie + " lei. Suma totala: " + sumaTotala + " lei");
            if (sumaTotala >= sumaTinta) {
                System.out.println("Suma tinta de donatii (" + sumaTinta + "lei) a fost atinsa cu success!");
            } else if (nrDonatii >= nrMaximDonatii) {
                System.out.println("Compania s-a incheiat, s-au atins " + nrMaximDonatii + " donatii");
            }
        }
    }
    //6
    public static String[] afisPropozitii(String fraza) {
        String[] propozitii = fraza.split("\\.");

        for (int i = 0; i < propozitii.length; i++) {
            propozitii[i] = propozitii[i].trim();
        }
        return propozitii;
    }
}

