
// Son Ngo

public class ThreeDice
{
	private int t1, t2, t3;
	int Throw()
	{
		Dice D1 = new Dice();
		Dice D2 = new Dice();
		Dice D3 = new Dice();
		
		int throw1 = D1.Throw();
		int throw2 = D2.Throw();
		int throw3 = D3.Throw();
		
		t1 = throw1;
		t2 = throw2;
		t3 = throw3;
		return (throw1 + throw2 + throw3) / 3;
	}
	
	@Override public String toString()
	{
		return String.format("First throw: %d Second throw: %d Last throw: %d", t1, t2, t3);
	}
}
