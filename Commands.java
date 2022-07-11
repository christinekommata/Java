class Commands
{
	public static void main(String args[])
	{
		// Branches
		int a = 5;
		if (a>10)
		{
			System.out.println("A is larger than 10");
		}
		else
		{
			System.out.println("A is smaller or equal to 10");		
		}

		// Equivaletly if we have one line after if or else
		/*
		if (a>10) System.out.println("A is larger than 10");
			else System.out.println("A is smaller or equal to 10");		
		*/

		// Combined if
		int b = 100;
		int c = 0;
		if ((c>a) && (c<=b))
		{
			System.out.println("c is between a and b");
		}

		int value = 5;
		String output = "";
		switch(value)
		{
			case 1:	output = "one"; break;
			case 2:	output = "two"; break;
			case 3:	output = "three"; break;
			case 4:	output = "four"; break;	
			default: output = "other";			
		}
		System.out.println(output);

		// Loops
		for (int i = 0; i < 10; i++)
		{
			System.out.print(i + ",");
		}
		// variable i lives only within the for loop

		// any block
		{
			int j = 10;
			// is a local variable that lives withing this block only
		}

		/*
		for (int i = 0;; i++) // infinite loop (ends using Ctrl+C)
		{
			System.out.print(i + ",");
		}
		*/

		int i = 0;
		while (i < 10)
		{
			System.out.println(i++);
		}

		i = 0;
		do
		{
			System.out.println(i++);
		} while (i < 10);
		
		// Break and continue
		
		// This one counts up to 5
		for (i = 0; i < 10; i++)
		{
			if (i == 5) break;
			System.out.print(i + ",");
		}
		System.out.println();

		// This one jumps 5
		for (i = 0; i < 10; i++)
		{
			if (i == 5) continue;
			System.out.print(i + ",");
		}

		// Breaks the program anywhere
		System.exit(0);
		
	}
}