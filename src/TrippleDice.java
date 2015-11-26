
public class TrippleDice extends Dice
{
	@Override int Throw()
	{
		int sum = 0;
		
		for (int i = 1; i <= 3; i++)
		{
			sum += super.Throw();
		}
		
		return sum / 3;
	}
}
