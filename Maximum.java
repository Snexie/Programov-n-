public class Maximum {
	public static void main (String[] args) {
		int max = Integer.MIN_VALUE;
		java.util.Scanner vstup = new java.util.Scanner(System.in) ;
		while (vstup.hasNextInt())	{
			int x = vstup.nextInt();
			if (max < x) {
				max = x;
			}
		}
			
		System.out.printf("Maximum je %d.\n", max);
	}
}
