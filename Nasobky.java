public class Nasobky {
    public static void main(String[] args) {
        for (int i = 0; i <= 30; i+= 3) {
            System.out.printf(" %d", i);
        }
        System.out.println("\n---------\n");
         
        /*
         * A te� varianta s maxim�ln� 4 n�sobky na ��dku.
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