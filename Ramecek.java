public class Ramecek {
    public static void main(String[] args) {
        int sirka = 20;
        int vyska = 3;
        int tloustka = 2;
         
        for (int radek = 0; radek < vyska + 2*tloustka; radek++) {
            for (int sloupec = 0; sloupec < sirka + 2*tloustka; sloupec++) {
                if (
                        (radek >= tloustka)
                        && (radek < tloustka + vyska)
                        && (sloupec >= tloustka)
                        && (sloupec < tloustka + sirka)
                    ) {
                    System.out.printf(" ");
                } else {
                    System.out.printf("X");
                }
            }
            System.out.println();
        }
    }
}