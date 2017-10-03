package lit.view;

import javax.swing.JOptionPane;

/**
 * The pop up display class for CTC AM Session 2017.
 * @author jham7125
 *@version 1.0 03.10.2017
 */
public class PopupDisplay 
{
	/**
	 * Displays the supplied message in a pop up window
	 * @param message
	 */
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Displays the supplied question in a pop up and returns answer as a String
	 * @param fromQuestion
	 * @return
	 */
	
	public String getResponse(String fromQuestion)
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, fromQuestion);
		
		return response;
	}
}
