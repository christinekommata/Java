class Variables
{
	public static void main(String args[])
	{
		int i; // 4 bytes
		i = 10;

		System.out.println("The value of i is " + i);

		int j = 5; // I can declare variables anywhere in my program

		System.out.println("The value of j is " + j);

		System.out.println("The value of i is " + i + " and the value of j is " + j);

		// int k;
		// k = i+j;

		System.out.println("The addition of i and j gives " + (i + j) );
		
		byte x = 6;
		char c = 'a';
		short s = 6;  // 2 bytes
		long l = 3L;  // 8 bytes
		
		float f = 5.6F;
		double d = 5.6;

		boolean boo = true; // or false

		System.out.println("The value of boo is " + boo);

		String str = "Hello";

		System.out.println("The value of str is " + str);

		// Special characters
		System.out.println("This is my text \n\"This is the next line\" ");
		System.out.printf("The value of i is %d and the value of j is %d", i, j);
		

	}
}