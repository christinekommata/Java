class Game
{
	public static void main(String args[])
	{
		Human m = new Human(); // m is an object of class Human (or m is an instance of Human)
		m.name = "Mary";
		m.height = 10;

		Human j = new Human();
		j.name = "John";
		j.height = 7;

		Ufo r = new Ufo();
		r.color = "red";
		r.diameter = 50;

		Ufo b; // declare variable b as of type Ufo
		b = new Ufo(); // construct a new object to hold an Ufo


	}
}