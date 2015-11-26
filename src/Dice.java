
// Son Ngo

import java.util.Random;

public class Dice
{
	int Throw()
	{
		Random rand = new Random();

		return rand.nextInt(6) + 1;
	}
}
