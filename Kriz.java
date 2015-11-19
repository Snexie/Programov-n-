public class Kriz {
    public static void main(String[] args) {
        int velikost = Integer.valueOf(args[0]);
        int sirka = 3 * velikost + 2;
        int vyskaRamene = velikost ;
        int tloustka = velikost ;
        for (int radek = 0; radek < sirka; radek++) {
          for (int sloupec = 0; sloupec <= vyskaRamene + tloustka - 1 ;  sloupec++) { 
            if (
                    (
                        (sloupec > vyskaRamene + 1)
                        && (radek <= velikost)
                    )
                    ||
                    (
                         (radek > vyskaRamene)
                         && (radek <= vyskaRamene + tloustka - 1)
                    )
                    ||
                    (     (radek > vyskaRamene + tloustka - 1)
                          &&(sloupec > vyskaRamene + 1)
                          &&(sloupec < 2 * vyskaRamene + 1)
                    )
              ) {
              System.out.printf("X");
            } else {
              System.out.printf(" ");
            }
	      }
        System.out.println() ;
      }
    }
}