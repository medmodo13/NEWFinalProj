public class masterRunner{
	public static void main(String args[])
    {

		PerfectSquare ps = (double perfectSquaree)-> ((Math.sqrt(perfectSquaree) - Math.floor(Math.sqrt(perfectSquaree))) == 0);

       System.out.println(ps.perfectSquare(64.0));

        PrintQuotient pq = (float a, float b)->System.out.printf("'%.3f'%n", (a/b));

        pq.findQuotient(9,3);

		}
	}

//What I learned (Medha) 
	//I learned about using lamdbas to implement an interface rather than having to override methods and how it is more efficient
	//System.out.printf method is a more logical way of printing out data. The format is: (% [flags] [width] [.precision] conversion-character, variable name)
	//Flags do things like left justify and comma grouping separation for large numbers 
	//width is the minimum amount of characters needed to be in the output, in this case there was no specification
	// precision in this case the 3 represented 3 decimal places
	//%n represents a conversion character for newline 
	//I also learned about the workings of GitHub in terms of editing files and what a workflow actually looks like. There's more to coding, and the organization of files can be just as important, which I understand better now
	


