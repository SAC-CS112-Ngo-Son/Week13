
// Son Ngo

public class Week13_Lab4
{

	public static void main(String[] args)
	{
		Dice d = new Dice();
		TrippleDice d3 = new TrippleDice();

		int iT = d.Throw();
		int iT3 = d3.Throw();
		
		System.out.println("d.Throw = " + iT + "\nd3.Throw = " + iT3);

		//System.out.println("dice value = " + iThrow);
		//System.out.println("dice.toString() = " + dice); 
	}

}
