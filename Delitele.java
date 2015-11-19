public class Delitele {
    public static void main(String[] args) {
   	 int a = Integer.valueOf(args[0]);
	 int b = 1;
		for (b = 1; b <= a; b = b + 1){
			if (( a % b) == 0){
			        System.out.printf("%d  ", b);
		System.out.println();
			}
		}
	}
}