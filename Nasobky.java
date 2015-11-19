public class Nasobky {
    public static void main(String[] args) {
        for (int i = 0; i <= 30; i+= 3) {
            System.out.printf(" %d", i);
        }
        System.out.println("\n---------\n");
         
        /*
         * A teï varianta s maximálnì 4 násobky na øádku.
         */
        int pocetNaRadku = 0;
        for (int i = 0; i <= 30; i+= 3) {
            System.out.printf(" %d", i);
            pocetNaRadku++;
            if ((pocetNaRadku % 4) == 0) {
                System.out.println();
            }
        }
        if (pocetNaRadku != 0) {
            System.out.println();
        }
    }
}