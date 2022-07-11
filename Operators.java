class Operators
{
	public static void main(String args[])
	{
		int a = 5;
		int b = 2;

		int c; 
		double d,e;

		// Division
		c = a / b; // the result is integer
		d = a / b; 
		System.out.println("d=" + d);
		d = b;
		System.out.println("d=" + d);
		e = a / d;
		System.out.println("e=" + e);

		System.out.println("With numbers -> " + 5/2.0);

		// Modulo
		c = a%b; // Modulo of the division

		// Type casting
		c = (int)e;		

		// Comparisons ==, !=, >=, >, <, <=
		boolean boo;
		boo = (a == b);
		System.out.println("Is " + a + " equal to " + b + "? " + boo);

		// Logic & (and), | (or), ^(xor)
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = b1 & b2; // logical AND

		// Binary >> (shift right), << (shift left)
		int bin = 4; // in binary 4 is 100		
		System.out.println("bin = " + bin);
		System.out.println("bin shifted left = " + (bin<<1));
		// Shifted bin in binary is 1000 which is decimal 8

		// Triadikos
		System.out.println("Is " + a + " equal to " + b + "? " + ((a==b)?"yes":"no"));
		System.out.println("Is " + a + " equal to " + b + "? " + ((boo)?"yes":"no")); // the same example using variable boo
		c = (a>b)?a:b; // find max value
		System.out.println("Max is " + c); // the same example using variable boo

		// Increment (++) - Decrement (--)
		int i = 0;
		i++; // i = i + 1;
		i+=5; // i = i + 5;
		i*=5; // i = i * 5;

		++i; // first increments i and then uses it
		i = 0;
		System.out.println(i++); // prints 0 and then does i = i + 1;
		i = 0;
		System.out.println(++i); // it does i = i + 1 and prints 1;


	}
}