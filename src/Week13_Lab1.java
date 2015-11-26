
// Son Ngo

import javax.swing.JOptionPane;

public class Week13_Lab1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ThreeDice dice = new ThreeDice();
		
		int iThrow = dice.Throw();
		
		JOptionPane.showMessageDialog(null, iThrow);
	}

}
