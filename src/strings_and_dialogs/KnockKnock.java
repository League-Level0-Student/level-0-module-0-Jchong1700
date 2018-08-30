package strings_and_dialogs;

import javax.swing.JOptionPane;

public class KnockKnock {
public static void main(String[] args) {
	JOptionPane.showInputDialog("Why did Sally fall off the swings?");
	JOptionPane.showMessageDialog(null, "She had no arms.");
	

	

	String answer = JOptionPane.showInputDialog("Knock Knock!");
	if(answer.equalsIgnoreCase("Who's there?")) {JOptionPane.showMessageDialog(null, "Not Sally!");
	
}
}
}
