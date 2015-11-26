
// Son Ngo

public class Week13_Lab2
{

	public static void main(String[] args)
	{
		ThreeDice dice = new ThreeDice();

		int iThrow = dice.Throw();

		System.out.println("dice value = " + iThrow);
		System.out.println("dice.toString() = " + dice.toString()); 
		System.out.println("dice = " + dice);
	}

}
