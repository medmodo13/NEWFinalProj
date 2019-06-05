public class masterRunner{
	public static void main(String args[])
    {

		PerfectSquare ps = (double perfectSquaree)-> ((Math.sqrt(perfectSquaree) - Math.floor(Math.sqrt(perfectSquaree))) == 0);

       System.out.println(ps.perfectSquare(64.0));

        PrintQuotient pq = (float a, float b)->System.out.printf("'%.3f'%n", (a/b));

        pq.findQuotient(9,3);

		}
	}
