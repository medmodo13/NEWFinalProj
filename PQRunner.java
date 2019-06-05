
public class Runner
{
    public static void main(String args[])
    {

        PrintQuotient pq = (float a, float b)->System.out.printf("'%.3f'%n", (a/b));

        pq.findQuotient(9,3);
    }
}
